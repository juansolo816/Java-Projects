public class NoSufficientFundsException extends Exception{
    
    public NoSufficientFundsException(){
        super("Insufficent Funds");
    }
    
    public NoSufficientFundsException(String message){
        super(message);
    }
}
