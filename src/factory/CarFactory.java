package factory;

import decorator.factory.Decorator;

public class CarFactory {
    
    private CarTypes type;
    private Decorator tradeFactory;
    
    /**
     * Initilzing the class.
     * 
     * @param factoryType The type of car factory
     * @param trade       the initial trade of the factory
     */
    public CarFactory(CarTypes factoryType, String trade) {
        type = factoryType;
        tradeFactory = new Decorator(trade);
        
    }
    
    /**
     * Produces a car of the same car types as the factory.
     * 
     * @return A car type that also has the trades attached
     */
    
    public Car createCar() {
        
        Car newCar = new Car(type);
        tradeFactory.applyTrades(newCar);
        
        return newCar;
        
    }
    
    public void update() {
        
    }
    
}
