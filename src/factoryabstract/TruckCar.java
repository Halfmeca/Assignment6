package factoryabstract;

import java.util.ArrayList;
import java.util.List;

public class TruckCar implements Car {
    
    private CarType type;
    private List<String> tradeMods;
    private List<String> uniqueParts;
    private List<String> generalParts;
    
    /**
     * Bog standard initalizers.
     */
    
    public TruckCar() {
        tradeMods = new ArrayList<>();
        uniqueParts = new ArrayList<>();
        generalParts = new ArrayList<>();
    }
    
    @Override
    public void setType(CarType type) {
        this.type = type;
        
    }
    
    @Override
    public void setTrade(List<String> trade) {
        tradeMods.addAll(trade);
        
    }
    
    @Override
    public List<String> getTrade() {
        
        return tradeMods;
    }
    
    @Override
    public CarType getType() {
        // TODO Auto-generated method stub
        return type;
    }

    @Override
    public void addParts(List<String> parts, List<String> uniqueParts) {
        generalParts.addAll(parts);
        this.uniqueParts.addAll(uniqueParts);
        
    }
    
}
