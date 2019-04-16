package cardecorator;

import factoryabstract.Car;
import factoryabstract.CarType;
import java.util.List;



public class Model implements Car {
    
    protected Car baseCar;
    protected String modelName;
    protected String creator;
    
    /**
     * Adds the model and the creator name for the car.
     * @param newCar The base car class
     * @param model The model name
     * @param creatorName the name of the manufacture
     */
    
    public Model(Car newCar, String model, String creatorName) {
        baseCar = newCar;
        modelName = model;
        creator = creatorName;
    }
    
    @Override
    public void setType(CarType type) {
        baseCar.setType(type);
        
    }
    
    @Override
    public void setTrade(List<String> trade) {
        baseCar.setTrade(trade);
        
    }
    
    @Override
    public List<String> getTrade() {
        // TODO Auto-generated method stub
        return baseCar.getTrade();
    }
    
    @Override
    public CarType getType() {
        // TODO Auto-generated method stub
        return baseCar.getType();
    }
    
    @Override
    public void addParts(List<String> parts, List<String> uniqueParts) {
        baseCar.addParts(parts, uniqueParts);
        
    }

    public Car getBaseCar() {
        return baseCar;
    }

    public String getModelName() {
        return modelName;
    }

    public String getCreator() {
        return creator;
    }
    
}
