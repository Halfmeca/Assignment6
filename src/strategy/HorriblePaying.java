package strategy;

public class HorriblePaying implements EmployeePayStrat {
    
    private int payTime = 8;
    private int payValue = 4;
    private String payStrat = "Under the table";
    private String benifits = "15 min break";
    
    
    
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
