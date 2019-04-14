package decorator.factory;

import factory.Car;
import java.util.ArrayList;
import java.util.List;






public class Decorator {
    
    private List<String> decorator;
    
    public Decorator(String decoration) {
        decorator = new ArrayList<String>();
        decorator.add(decoration);
    }
    
    public Car applyTrades(Car singleCar) {
        singleCar.applyTrades(decorator);
        return singleCar;
    }
    
    public List<String> getDeocrations() {
        return decorator;
        
    }
    
    public void update(List<String> newDecorations) {
        decorator.addAll(newDecorations);
        
    }
    
}
