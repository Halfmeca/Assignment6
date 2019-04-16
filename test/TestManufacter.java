package test;

import static org.junit.Assert.assertEquals;

import cardecorator.Model;
import factoryabstract.Car;
import factoryabstract.CarType;
import factoryabstract.HybridCar;
import factoryabstract.HybridFactory;
import factoryabstract.SportCar;
import factoryabstract.TruckCar;
import java.util.ArrayList;
import java.util.List;
import manufactuerer.Manufacturer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class TestManufacter {
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }
    
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }
    
    @Before
    public void setUp() throws Exception {
    }
    
    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void testCreation() {
        Manufacturer honda = new Manufacturer("Honda");
        
        assertEquals(honda.getName(), "Honda");
    }
    
    @Test
    public void testFactoryAdding() {
        Manufacturer honda = new Manufacturer("Honda");
        honda.addNewFactory(CarType.HYBRID, "cheap");
        honda.addNewFactory(CarType.TRUCK, "heavy");
        honda.addNewFactory(CarType.SPORT, "fast");
        
        assertEquals(honda.getAllFactories().size(), 3);
        
    }
    
    @Test
    public void testCarCreation() {
        Manufacturer honda = new Manufacturer("Honda");
        honda.addNewFactory(CarType.HYBRID, "TEST1");
        
        HybridCar testHybridCar;
        testHybridCar = new HybridCar();
        List<String> trades = new ArrayList<>();
        trades.add("TEST1");
        testHybridCar.setTrade(trades);
        testHybridCar.setType(CarType.HYBRID);
        
        assertEquals(honda.getCar(CarType.HYBRID, "TEST1").getTrade(), testHybridCar.getTrade());
        assertEquals(honda.getCar(CarType.HYBRID, "TEST1").getType(), testHybridCar.getType());
        
        honda.addNewFactory(CarType.SPORT, "TEST2");
        trades.clear();
        trades.add("TEST2");
        SportCar testSportCar;
        testSportCar = new SportCar();
        testSportCar.setTrade(trades);
        testSportCar.setType(CarType.SPORT);
        
        assertEquals(honda.getCar(CarType.SPORT, "TEST2").getTrade(), testSportCar.getTrade());
        assertEquals(honda.getCar(CarType.SPORT, "TEST2").getType(), testSportCar.getType());
        
        honda.addNewFactory(CarType.TRUCK, "TEST3");
        trades.clear();
        trades.add("TEST3");
        TruckCar testTruckCar;
        testTruckCar = new TruckCar();
        testTruckCar.setTrade(trades);
        testTruckCar.setType(CarType.TRUCK);
        
        assertEquals(honda.getCar(CarType.TRUCK, "TEST3").getTrade(), testTruckCar.getTrade());
        assertEquals(honda.getCar(CarType.TRUCK, "TEST3").getType(), testTruckCar.getType());
        
    }
    
    @Test
    public void testModelCreation() {
        Manufacturer honda = new Manufacturer("Honda");
        honda.addNewFactory(CarType.HYBRID, "TEST1");
        Model testModel0 = honda.getCarModel(CarType.HYBRID, "Fit", "TEST1");
        
        HybridFactory newFactory = new HybridFactory("TEST1", CarType.HYBRID);
        Car testCar = newFactory.createCar();
        testCar.setType(CarType.HYBRID);
        
        Model testModel = new Model(testCar, "Fit", "Honda");
        assertEquals(testModel.getCreator(), testModel0.getCreator());
        assertEquals(testModel.getModelName(), testModel0.getModelName());
        
    }
    
    @Test
    public void testAddEmployee() {
        Manufacturer honda = new Manufacturer("Honda");
        honda.addFactoryOwner("BOB");
        honda.addFactoryWorker("BORB");
        
        assertEquals(honda.getFactoryEmployees().getAllEmployees().get(0).getEmployeeName(),
                "BORB");
        assertEquals(honda.getFactoryOwners().getAllEmployees().get(0).getEmployeeName(),
                "BOB");
    }
    
    @Test
    public void testMergeEmployee() {
        Manufacturer honda1 = new Manufacturer("Honda1");
        Manufacturer honda2 = new Manufacturer("Honda2");
        honda2.addFactoryWorker("BORB");
        honda2.addFactoryOwner("BOB");
        honda1.absorbManufacterEmployees(honda2.getFactoryEmployees(), honda2.getFactoryOwners());
        assertEquals(honda1.getFactoryEmployees().getAllEmployees().get(0).getEmployeeName(),
                "BORB");
        assertEquals(honda1.getFactoryOwners().getAllEmployees().get(0).getEmployeeName(),
                "BOB");
        
        
    }
    
}
