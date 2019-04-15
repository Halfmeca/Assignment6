package strategy;



public class BadPaying implements EmployeePayStrat {
    
    private int payTime = 10;
    private int payValue = 2;
    private String payStrat = "Out a window";
    private String benifits = "None";
    
    
    
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
