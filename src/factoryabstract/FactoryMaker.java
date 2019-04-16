package factoryabstract;

public class FactoryMaker {
    
    /**
     * Creates a factory for the manufacter.
     * 
     * @param type  The type of factory
     * @param trade The base trade of the factory
     * @return the factory created given in that type
     */
    
    public Factory getFactory(CarType type, String trade) {
        
        switch (type) {
            case HYBRID:
                return new HybridFactory(trade, type);
            case SPORT:
                return new SportFactory(trade, type);
            case TRUCK:
                return new TruckFactory(trade, type);
            default:
                return null;
            
        }
        
    }
    
}
