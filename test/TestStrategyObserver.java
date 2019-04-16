package test;

import static org.junit.Assert.assertEquals;

import observer.EmployeeObserver;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import strategy.BadPaying;
import strategy.Employee;
import strategy.EmployeePayStrat;
import strategy.GoodPaying;
import strategy.HorriblePaying;
import strategy.OkayPaying;
import strategy.WellPaying;

public class TestStrategyObserver {
    
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
    public void testStates() {
        // This test is jsst to make sure everything creates ok
        EmployeePayStrat testStrat = new GoodPaying();
        assertEquals(testStrat.getBenifits(), "Health Care");
        assertEquals(testStrat.getPayStrat(), "Direct Transfer");
        assertEquals(testStrat.getPayTime(), 4);
        assertEquals(testStrat.getPayValue(), 8);
        
        testStrat = new HorriblePaying();
        assertEquals(testStrat.getPayStrat(), "Under the table");
        assertEquals(testStrat.getBenifits(), "15 min break");
        assertEquals(testStrat.getPayTime(), 8);
        assertEquals(testStrat.getPayValue(), 4);
        
        testStrat = new OkayPaying();
        assertEquals(testStrat.getPayStrat(), "Check");
        assertEquals(testStrat.getBenifits(), "Lunch Break");
        assertEquals(testStrat.getPayTime(), 6);
        assertEquals(testStrat.getPayValue(), 6);
        
        testStrat = new WellPaying();
        assertEquals(testStrat.getPayStrat(), "Big Bag of money");
        assertEquals(testStrat.getBenifits(), "Vacation Days");
        assertEquals(testStrat.getPayTime(), 2);
        assertEquals(testStrat.getPayValue(), 10);
        
        testStrat = new BadPaying();
        assertEquals(testStrat.getBenifits(), "None");
        assertEquals(testStrat.getPayStrat(), "Out a window");
        assertEquals(testStrat.getPayTime(), 10);
        assertEquals(testStrat.getPayValue(), 2);
        
    }
    
    @Test
    
    public void testObserver() {
        EmployeeObserver newObserver = new EmployeeObserver();
        new Employee(newObserver, "Tim");
        assertEquals(newObserver.getAllEmployees().get(0).getEmployeeName(),
                "Tim");
        newObserver.setPayStrat(new BadPaying());
        
        assertEquals(newObserver.getAllEmployees().get(0).getPayStrat().getBenifits(), "None");
        
        
    }
    
}
