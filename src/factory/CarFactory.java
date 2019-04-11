package factory;

public class CarFactory {
    
    public CarTypes type;
    public String trades; // Change later
    
    public CarFactory(CarTypes factoryType) {
        type = factoryType;
        
    }
    /**
     * Produces a car of the same car types as the factory.
     * @return A car type that also has the trades attached
     */
    
    public Car createCar() {
        
        Car newCar = new Car(type);
        
        return newCar;
        
    }
    
}
