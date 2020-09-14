public class Test {
    
    public static void main(String [] args) {
        //Declare array of Account type, named accounts; size 4
        Account[] accounts = new Account[4];
        //Initialize elements in array
        accounts[0] = new CheckingAccount(1, 9999);
        accounts[1] = new CheckingAccount(2, 500);
        accounts[2] = new SavingAccount(3, 3, 5000);
        accounts[3] = new SavingAccount(10, 4, 5678);
        
        
        //Make deposits, withdraws, and add interestRate 
        // Account 1
        System.out.println(accounts[0].toString());
        try {
            accounts[0].deposit(1);
        }
        
        catch (IllegalAmountException ex){
            System.out.println(ex);
        }
        
        
        //Account 2
        System.out.println(accounts[1].toString());
        try {
            accounts[1].withdraw(-100);
        }
        catch (IllegalAmountException ex){
            System.out.println(ex);
        }
        catch (NoSufficientFundsException nfex){
            System.out.println(nfex);
        }
        
        //Account 3
        System.out.println(accounts[2].toString());
        ((SavingAccount) accounts[2]).addInterest();
        
        
        //Account 4
        System.out.println("\nInfo: \n" + accounts[3].toString());
        try {
            accounts[3].withdraw(85000);
        }
        catch (IllegalAmountException ex){
            System.out.println(ex);
        }
        catch (NoSufficientFundsException nfex){
            System.out.println(nfex);
        }
       
        
        //Make easier to read
        System.out.println("\n\n");  
        
        //Display Account info updated
        for (int i = 0; i < accounts.length; i++) {
            System.out.println("\nUpdated Info: \n" + accounts[i].toString());
        }
        
        new java.util.Date();
    }
}
