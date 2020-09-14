public class CheckingAccount extends Account{
    
    public CheckingAccount(){
        super();
    }
    
    public CheckingAccount(int id, double balance){
        super(id, balance);
    }
    
    public void withdraw(double amount) throws IllegalAmountException, NoSufficientFundsException  {
        if (amount < 0) 
            throw new IllegalAmountException("Withdraw amount must be positive");
            
        if(amount > getBalance())
            throw new NoSufficientFundsException("Insufficient Funds");
            
        setBalance(getBalance() - amount);
    }
    
   
}
