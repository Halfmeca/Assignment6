package factoryabstract;

import java.util.ArrayList;
import java.util.List;

public class TruckFactory extends Factory {
    
    /**
     * Starts the factory to producing cars.
     * 
     * @param baseTrade The type of the factory
     */
    
    public TruckFactory(String baseTrade, CarType type) {
        trade = new ArrayList<>();
        trade.add(baseTrade);
        unqiueParts = new ArrayList<>();
        unqiueParts.add("Truck bed");
        unqiueParts.add("V8 Engine");
        unqiueParts.add("Disel Gas Tank");
        addGeneralParts();
        this.type = type;
    }
    
    @Override
    public Car createCar() {
        
        Car newCar = new HybridCar();
        newCar.setTrade(trade);
        newCar.addParts(generalParts, unqiueParts);
        newCar.setType(type);
        return newCar;
    }
    
    @Override
    public void update(List<String> newTrades) {
        // TODO Auto-generated method stub
        trade.addAll(newTrades);
    }
    
}
