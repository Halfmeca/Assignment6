package strategy;



public class OkayPaying implements EmployeePayStrat {
    
    private int payTime = 6;
    private int payValue = 6;
    private String payStrat = "Check";
    private String benifits = "Lunch Break";
    
    
    
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
