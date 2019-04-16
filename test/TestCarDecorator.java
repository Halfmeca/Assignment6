package test;

import static org.junit.Assert.assertEquals;

import cardecorator.Model;
import factoryabstract.Car;
import factoryabstract.CarType;
import factoryabstract.HybridFactory;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;




public class TestCarDecorator {
    
    @Test
    public void testModel() {
        HybridFactory newFactory = new HybridFactory("TEST1", CarType.HYBRID);
        Car testCar = newFactory.createCar();
        testCar.setType(CarType.HYBRID);
        
        Model testModel = new Model(testCar, "Fit", "Honda");
        assertEquals(testModel.getCreator(), "Honda");
        assertEquals(testModel.getModelName(), "Fit");
        
        
        assertEquals(testModel.getTrade(), testCar.getTrade());
        assertEquals(testModel.getType(), testCar.getType());
        
        List<String> newTrades = new ArrayList<>();
        newTrades.add("TEST2");
        
        testModel.setTrade(newTrades);
        testCar.setTrade(newTrades);
        
        assertEquals(testModel.getTrade(), testCar.getTrade());
        assertEquals(testModel.getType(), testCar.getType());
        
        assertEquals(testModel.getBaseCar(), testCar);
        
        testModel.setType(CarType.SPORT);
        testCar.setType(CarType.SPORT);
        assertEquals(testModel.getType(), testCar.getType());
        
        
        System.out.println("TEST");
        
        
       
    }
    
}
