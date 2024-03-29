package strategy;

import observer.EmployeeObserver;
import observer.Observer;

public class Employee extends Observer {
    
    private EmployeePayStrat strategy;
    private String employeeName;
    
    
    /**
     * Adds the employee to the observer class and sets the name.
     * 
     * @param observer The observer type for the employee
     * @param name     THe name of the employee
     */
    
    public Employee(EmployeeObserver observer, String name) {
        employeeName = name;
        this.observer = observer;
        observer.attach(this);
        update();
       
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    
    public EmployeePayStrat getPayStrat() {
        return strategy;
    }
    
    @Override
    public void update() {
        strategy = observer.getStrategy();
        
    }
    
}
