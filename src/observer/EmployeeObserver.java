package observer;

import java.util.ArrayList;
import java.util.List;

import strategy.Employee;
import strategy.EmployeePayStrat;

public class EmployeeObserver {
    
    private List<Employee> employees;
    private EmployeePayStrat strategy;
    
    public EmployeeObserver() {
        employees = new ArrayList<>();
    }
    
    public EmployeePayStrat getStrategy() {
        return strategy;
    }
    
    public void setPayStrat(EmployeePayStrat newStrategy) {
        strategy = newStrategy;
        notifyAllObservers();
    }
     
    public void attach(Employee observer) {
        employees.add(observer);
    }
    
    /**
     * Updates all employees to the new pay strategy.
     */
    
    public void notifyAllObservers() {
        for (Observer observer : employees) {
            observer.update();
        }
    }
    
    public List<Employee> getAllEmployees() {
        return employees;
    }
    
    public void clearEmployees() {
        employees.clear();
    }
    
}
