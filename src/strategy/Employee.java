package strategy;

import observer.EmployeeObserver;
import observer.Observer;

public class Employee extends Observer {
    
    private EmployeePayStrat strategy;
    private String employeeName;
    private int payGiven;
    
    /**
     * Adds the employee to the observer class and sets the name.
     * 
     * @param observer The observer type for the employee
     * @param name     THe name of the employee
     */
    
    public Employee(EmployeeObserver observer, String name) {
        employeeName = name;
        this.observer = observer;
        Employee test = this;
        observer.attach(this);
        update();
        payGiven = 0;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    
    public void payDay() {
        payGiven += strategy.getPayValue();
    }
    
    public int getPayGiven() {
        return payGiven;
    }
    
    public EmployeePayStrat getPayStrat() {
        return strategy;
    }
    
    @Override
    public void update() {
        strategy = observer.getStrategy();
        
    }
    
}
