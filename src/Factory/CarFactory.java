package Factory;

public class CarFactory {
    
    public CarTypes type;
    public String trades; //Change later
    
    public CarFactory(CarTypes factoryType)
    {
        type = factoryType;
        
    }
    
    
    public Car createCar()
    {
        Car newCar = new Car(type);
        
        return newCar;
        
    }
    
    
    
    
}
