import java.util.List;

import cardecorator.Model;
import factoryabstract.Car;
import factoryabstract.CarType;
import observer.Observer;
import strategy.GoodPaying;
import strategy.BadPaying;
import strategy.Employee;

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
        
        System.out.print("Setting the Factory Owner Pay ");
        honda.changeFactoryOwnerPay(new GoodPaying());
        System.out.println(honda.getFactoryOwners().getStrategy().getPayStrat());
        List<Employee> employees = honda.getFactoryOwners().getAllEmployees();
        for (Employee obs : employees) {
            System.out.println(obs.getEmployeeName() + " " + obs.getPayStrat().getPayStrat());
            
        }
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
        honda.changeFactoryWorkerPay(new BadPaying());
        System.out.print("Setting the Factory Employee Pay ");
        System.out.println(honda.getFactoryEmployees().getStrategy().getPayStrat());
        
        employees = honda.getFactoryEmployees().getAllEmployees();
        
        for (Employee obs : employees) {
            
            System.out.println(obs.getEmployeeName() + " " + obs.getPayStrat().getPayStrat());
            
        }
            
        
        System.out.println("\n\nCreating some cars");
        Car carHolder = honda.getCar(CarType.HYBRID);
        System.out.println(carHolder.getTrade() + " " + carHolder.getType());
        carHolder = honda.getCar(CarType.SPORT);
        System.out.println(carHolder.getTrade() + " " + carHolder.getType());
        carHolder = honda.getCar(CarType.TRUCK);
        System.out.println(carHolder.getTrade() + " " + carHolder.getType());
        
        
        carHolder = honda.getCar(CarType.HYBRID, "zippy");
        System.out.println(carHolder.getTrade() + " " + carHolder.getType());
        carHolder = honda.getCar(CarType.TRUCK, "deadly");
        System.out.println(carHolder.getTrade() + " " + carHolder.getType());
        carHolder = honda.getCar(CarType.SPORT, "SUPERFAST");
        System.out.println(carHolder.getTrade() + " " + carHolder.getType());
        
        System.out.println("\n\nCreating a couple car models");
        Model modelHolder = honda.getCarModel(CarType.HYBRID, "Fit");
        System.out.println(modelHolder.getTrade() + " " + modelHolder.getType() + " " 
            + modelHolder.getModelName() + " " + modelHolder.getCreator());        
        modelHolder = honda.getCarModel(CarType.SPORT, "Element");
        System.out.println(modelHolder.getTrade() + " " + modelHolder.getType() + " " 
                + modelHolder.getModelName() + " " + modelHolder.getCreator());
        modelHolder = honda.getCarModel(CarType.TRUCK, "Odysee");
        System.out.println(modelHolder.getTrade() + " " + modelHolder.getType() + " " 
                + modelHolder.getModelName() + " " + modelHolder.getCreator());
        
        modelHolder = honda.getCarModel(CarType.HYBRID, "Fit", "zippy");
        System.out.println(modelHolder.getTrade() + " " + modelHolder.getType() + " " 
            + modelHolder.getModelName() + " " + modelHolder.getCreator());        
        modelHolder = honda.getCarModel(CarType.SPORT, "Element", "SUPERFAST");
        System.out.println(modelHolder.getTrade() + " " + modelHolder.getType() + " " 
                + modelHolder.getModelName() + " " + modelHolder.getCreator());
        modelHolder = honda.getCarModel(CarType.TRUCK, "Odysee", "deadly");
        System.out.println(modelHolder.getTrade() + " " + modelHolder.getType() + " " 
                + modelHolder.getModelName() + " " + modelHolder.getCreator());
        
        
        
        
    }
    
}
