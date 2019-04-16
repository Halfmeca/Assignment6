import factoryabstract.Car;
import factoryabstract.CarType;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Creating Honda");
        System.out.println("\n\nAdding new Factories");
        Manufacturer honda = new Manufacturer("Honda");
        System.out.println("Adding Hybrid Factory Trade:cheap");
        honda.addNewFactory(CarType.HYBRID, "cheap");
        System.out.println("Adding Truck Factory Trade:heavy");
        honda.addNewFactory(CarType.TRUCK, "heavy");
        System.out.println("Adding Sport Factory Trade:fast");
        honda.addNewFactory(CarType.SPORT, "fast");
        System.out.println("Adding Hybrid Factory Trade:zippy");
        honda.addNewFactory(CarType.HYBRID, "zippy");
        System.out.println("Adding Truck Factory Trade:deadly");
        honda.addNewFactory(CarType.TRUCK, "deadly");
        System.out.println("Adding Sport Factory Trade:SUPERFAST");
        honda.addNewFactory(CarType.SPORT, "SUPERFAST");//I Don't know cars
        
        System.out.println("\n\nAdding Factory Owners");
        System.out.println("Adding Factory Owner Employee Bob");
        honda.addFactoryOwner("Bob");
        System.out.println("Adding Factory Owner Employee Tob");
        honda.addFactoryOwner("Tob");
        System.out.println("Adding Factory Owner Employee Rob");
        honda.addFactoryOwner("Rob");
        System.out.println("Adding Factory Owner Employee Cob");
        honda.addFactoryOwner("Cob");
        System.out.println("Adding Factory Owner Employee Fob");
        honda.addFactoryOwner("Fob");
        
        System.out.println("\n\nAdding Factory Employess");
        System.out.println("Adding Factory Employee Brob");
        honda.addFactoryWorker("Borb");
        System.out.println("Adding Factory Employee Trob");
        honda.addFactoryWorker("Torb");
        System.out.println("Adding Factory Employee Rrob");
        honda.addFactoryWorker("Rorb");
        System.out.println("Adding Factory Employee Crob");
        honda.addFactoryWorker("Corb");
        System.out.println("Adding Factory Employee Frob");
        honda.addFactoryWorker("Forb");
        
        Car carHolder = honda.getCar(CarType.HYBRID);
        System.out.println(carHolder.getTrade() + " " + carHolder.getType());
        
    }
    
}
