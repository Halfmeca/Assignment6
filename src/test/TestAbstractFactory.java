package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import factoryabstract.CarType;
import factoryabstract.Factory;
import factoryabstract.FactoryMaker;

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
    
}
