package factoryabstract;

import java.util.List;

public interface Car {
    
    public void setType(CarType type);
   
    public void setTrade(List<String> trade);
    
    public List<String> getTrade();
    
    public CarType getType();
    
    public void addParts(List<String> parts, List<String> uniqueParts);
   
}
