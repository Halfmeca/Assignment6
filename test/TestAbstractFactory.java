package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import factoryabstract.Car;
import factoryabstract.CarType;
import factoryabstract.Factory;
import factoryabstract.FactoryMaker;
import factoryabstract.HybridCar;
import factoryabstract.SportCar;
import factoryabstract.TruckCar;

public class TestAbstractFactory {
    
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
    public void testFactoryMaker() {
        FactoryMaker newFactoryMaker = new FactoryMaker();
        
        Factory newFactory = newFactoryMaker.getFactory(CarType.HYBRID, "TEST1");
        
        assertEquals(newFactory.getTrade().get(0), "TEST1");
        newFactory = newFactoryMaker.getFactory(CarType.SPORT, "TEST2");
        assertEquals(newFactory.getTrade().get(0), "TEST2");
        newFactory = newFactoryMaker.getFactory(CarType.TRUCK, "TEST3");
        assertEquals(newFactory.getTrade().get(0), "TEST3");
        
    }
    
    @Test
    public void testFactoriesCreateCar() {
        
        FactoryMaker newFactoryMaker = new FactoryMaker();
        
        Factory newFactory = newFactoryMaker.getFactory(CarType.HYBRID, "TEST1");
        
        Car outputCar;
        outputCar = newFactory.createCar();
        
        HybridCar testHybridCar;
        testHybridCar = new HybridCar();
        List<String> trades = new ArrayList<>();
        trades.add("TEST1");
        testHybridCar.setTrade(trades);
        testHybridCar.setType(CarType.HYBRID);
        
        assertEquals(testHybridCar.getTrade(), outputCar.getTrade());
        assertEquals(testHybridCar.getType(), outputCar.getType());
        
        trades.clear();
        trades.add("TEST2");
        newFactory = newFactoryMaker.getFactory(CarType.SPORT, "TEST2");
        outputCar = newFactory.createCar();
        SportCar testSportCar;
        testSportCar = new SportCar();
        testSportCar.setTrade(trades);
        testSportCar.setType(CarType.SPORT);
        
        assertEquals(testSportCar.getTrade(), outputCar.getTrade());
        assertEquals(testSportCar.getType(), outputCar.getType());
        
        trades.clear();
        trades.add("TEST3");
        
        newFactory = newFactoryMaker.getFactory(CarType.TRUCK, "TEST3");
        outputCar = newFactory.createCar();
        TruckCar testTruckCar;
        testTruckCar = new TruckCar();
        testTruckCar.setTrade(trades);
        testTruckCar.setType(CarType.TRUCK);
        
        assertEquals(testTruckCar.getTrade(), outputCar.getTrade());
        assertEquals(testTruckCar.getType(), outputCar.getType());
        
        
        
        
    }
    
}
