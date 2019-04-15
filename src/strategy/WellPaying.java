package strategy;



public class WellPaying implements EmployeePayStrat {
    
    private int payTime = 2;
    private int payValue = 10;
    private String payStrat = "Big Bag of money";
    private String benifits = "Vacation Days";
    
    
    
    @Override
    public String getPayStrat() {
        
        return payStrat;
    }
    
    @Override
    public int getPayTime() {
        
        return payTime;
    }
    
    @Override
    public int getPayValue() {
        
        return payValue;
    }
    
    @Override
    public String getBenifits() {
       
        return benifits;
    }
    
    
}
