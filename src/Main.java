import factoryabstract.CarType;

public class Main {
    
    public static void main(String[] args) {
        Manufacturer honda = new Manufacturer("Honda");
        honda.addNewFactory(CarType.HYBRID, "cheap");
        honda.addNewFactory(CarType.TRUCK, "heavy");
        honda.addNewFactory(CarType.SPORT, "fast");
        honda.addNewFactory(CarType.HYBRID, "zippy");
        honda.addNewFactory(CarType.TRUCK, "deadly");
        honda.addNewFactory(CarType.SPORT, "SUPERFAST");//I Don't know cars
        
        honda.addFactoryOwner("Bob");
        honda.addFactoryOwner("Tob");
        honda.addFactoryOwner("Rob");
        honda.addFactoryOwner("Cob");
        honda.addFactoryOwner("Fob");
        
        honda.addFactoryWorker("Borb");
        honda.addFactoryWorker("Torb");
        honda.addFactoryWorker("Rorb");
        honda.addFactoryWorker("Corb");
        honda.addFactoryWorker("Forb");
        
    }
    
}
