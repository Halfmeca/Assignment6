package observer;

import java.util.List;

import strategy.EmployeePayStrat;

public class EmployeeObserver {
    
    private List<Observer> employees;
    private EmployeePayStrat strategy;
    
    public EmployeePayStrat getStrategy() {
        return strategy;
    }
    
    public void setPayStrat(EmployeePayStrat newStrategy) {
        strategy = newStrategy;
        notifyAllObservers();
    }
    
    public void attach(Observer observer) {
        employees.add(observer);
    }
    /**
     * Updates all employess to the new pay strategy.
     */
    
    public void notifyAllObservers() {
        for (Observer observer : employees) {
            observer.update();
        }
    }
    
}
