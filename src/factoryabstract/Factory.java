package factoryabstract;

import java.util.ArrayList;
import java.util.List;

public abstract class Factory {
    
    protected CarType type;
    protected List<String> trade;
    protected List<String> generalParts;
    protected List<String> unqiueParts;
    
    /**
     * Produce a car of the type of factory.
     * 
     * @return type of the car
     */
    
    public abstract Car createCar();
    
    /**
     * Updates the factory with the new trades aquired.
     * 
     * @param newTrades The new trades found from the new factories
     */
    
    public abstract void update(List<String> newTrades);
    
    /**
     * Creates the generalParts list.
     */
    
    public List<String> getTrade() {
        return trade;
    }
    
    public void addGeneralParts() {
        generalParts = new ArrayList<>();
        generalParts.add("Tires");
        generalParts.add("Steering Wheel");
        generalParts.add("Doors");
        generalParts.add("Seats");
        
    }
}
