import factoryabstract.Car;
import factoryabstract.CarType;
import factoryabstract.Factory;
import factoryabstract.FactoryMaker;
import factoryabstract.HybridFactory;
import factoryabstract.SportFactory;
import factoryabstract.TruckFactory;
import observer.EmployeeObserver;

import java.util.ArrayList;
import java.util.List;

public class Manufacturer {
    
    private String name;
    private FactoryMaker factoryFactory;
    // I have these seperated for testing purposes
    private List<Factory> hybridFactories;
    private List<Factory> truckFactories;
    private List<Factory> sportFactories;
    // This is so I have full acess also for testing purposes
    private List<Factory> allFactories;
    private EmployeeObserver factoryEmployees;
    private EmployeeObserver factoryOwners;
    
    /**
     * Sets the name of the manufcater and creates the lists for the factories.
     * 
     * @param name The name of the manufcaterer
     */
    public Manufacturer(String name) {
        this.name = name;
        factoryFactory = new FactoryMaker();
        hybridFactories = new ArrayList<>();
        truckFactories = new ArrayList<>();
        sportFactories = new ArrayList<>();
        allFactories = new ArrayList<>();
        factoryEmployees = new EmployeeObserver();
        factoryOwners = new EmployeeObserver(); 
    }
    
    /**
     * Creates a new factory for the manufactuerer .
     * 
     * @param type  THe type of the factory to be created
     * @param trade The base trade of the factory
     */
    
    public void addNewFactory(CarType type, String trade) {
        Factory newFactory = factoryFactory.getFactory(type, trade);
        allFactories.add(newFactory);
        switch (type) {
            case HYBRID:
                hybridFactories.add(newFactory);
                break;
            
            case SPORT:
                sportFactories.add(newFactory);
                break;
            case TRUCK:
                truckFactories.add(newFactory);
                break;
            
            default:
                System.out.println("SOMETHING WENT WRONG" + type);
                
        }
    }
    
    /**
     * creates a base car from the first factory added.
     * 
     * @param type The type of car requested
     * @return The constructed car
     */
    
    public Car getCar(CarType type) {
        
        switch (type) {
            case HYBRID:
                return hybridFactories.get(0).createCar();
            
            case SPORT:
                return sportFactories.get(0).createCar();
            
            case TRUCK:
                return truckFactories.get(0).createCar();
            
            default:
                System.out.println("SOMETHING WENT WRONG" + type);
                return null;
            
        }
        
    }
    
    /**
     * Creates a car of a specifed trade type.
     * 
     * @param type  The type of wanted
     * @param trade The trade of the car that is desired
     * @return
     */
    
    public Car getCar(CarType type, String trade) {
        
        switch (type) {
            case HYBRID:
                return getSpecificFactoryTrade(hybridFactories, trade).createCar();
            
            case SPORT:
                return getSpecificFactoryTrade(sportFactories, trade).createCar();
            
            case TRUCK:
                return getSpecificFactoryTrade(truckFactories, trade).createCar();
            
            default:
                System.out.println("SOMETHING WENT WRONG" + type);
                
        }
        
        return null;
        
    }
    
    /**
     * Searches the factory list to find the trade requied.
     * 
     * @param factories The search range
     * @param trade     The trade being looked for
     * @return
     */
    private Factory getSpecificFactoryTrade(List<Factory> factories, String trade) {
        for (Factory factory : factories) {
            if (factory.getTrade().contains(trade)) {
                return factory;
            }
        }
        
        return null;
    }
    
    public List<Factory> getAllFactories() {
        return allFactories;
    }
    
    public String getName() {
        return name;
    }
    
    public List<Factory> getHybridFactories() {
        return hybridFactories;
    }
    
    public List<Factory> getTruckFactories() {
        return truckFactories;
    }
    
    public List<Factory> getSportFactories() {
        return sportFactories;
    }
    
}
