package factory;

import java.util.List;

public class Car {
    
    private CarTypes type;
    private List<String> tradeMods;
    
    public Car(CarTypes type) {
        this.type = type;
    }
    
    public CarTypes getCarType() {
        return type;
    }
    
    public void applyTrades(List<String> traits) {
        tradeMods.addAll(traits);
    }
    
    public List<String> getTradeMods() {
        
        return tradeMods;
    }
    
}
