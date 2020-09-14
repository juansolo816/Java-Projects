public class SavingAccount extends Account{
    
    private double interestRate;
    
    public SavingAccount() {
    }
    
    public SavingAccount(int id, double balance){
        
    }
    
    public SavingAccount(double interestRate, int id, double balance){
        super(id, balance);
        this.interestRate = interestRate;
        
    }
    
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }
    
    public double getInterestRate(){
        return interestRate;
    }
    
    public void withdraw(double amount) 
            throws IllegalAmountException, NoSufficientFundsException{
        if (amount < 0)
            throw new IllegalAmountException("Amount must be positive");
            
        if(amount > getBalance())
            throw new NoSufficientFundsException("Insufficient Funds");
        
        setBalance(getBalance() - amount);
    }
    
    public void addInterest(){
        setBalance(getBalance() * (1 + interestRate));
    }
    
    public String toString() {
        return super.toString() + "\nInterest Rate: " + interestRate;
    }
}
