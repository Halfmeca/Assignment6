package strategy;



public class GoodPaying implements EmployeePayStrat {
    
    private int payTime = 4;
    private int payValue = 8;
    private String payStrat = "Direct Transfer";
    private String benifits = "Health Care";
    
    
    
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
