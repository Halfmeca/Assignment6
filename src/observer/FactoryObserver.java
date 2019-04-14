package observer;

import factory.CarFactory;
import java.util.List;

public class FactoryObserver {
    
    private List<CarFactory> factories;
    
    public void update(FactoryObserver newFactories) {
        List<CarFactory> listFactories = newFactories.getFactories();
        
        for (int ii = 0; ii < listFactories.size(); ii++) {
            
        }
        
    }
    
    public void add() {
        
    }
    
    public void remove() {
        
    }
    
    public List<CarFactory> getFactories() {
        return factories;
    }
    
}