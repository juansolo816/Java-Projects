public class Account {
    
    private int id;
    private double balance;
    
    public Account() {
    }
    
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void deposit(double amount) throws IllegalAmountException{
        if(amount <= 0){
            throw new IllegalAmountException("Deposit amount must be positive");
        }
        else {
            balance += amount;
        }
    }
    
    public void withdraw(double amount) throws IllegalAmountException, NoSufficientFundsException {
        if (amount < getBalance()){
            throw new IllegalAmountException("Amount must be less than current" +
             " balance of: " + getBalance());
        }
        
        if(amount > getBalance()){
            throw new NoSufficientFundsException("Insufficient Funds");
        }
    }
    
    public String toString() {
        return "\nAccount ID: " + id + "\nBalance: " + balance;
    }
    
}
