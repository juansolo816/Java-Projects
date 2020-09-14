public class IllegalAmountException extends Exception
{
    
    public IllegalAmountException(){
        super("The amount is not legal");
    }
    
    public IllegalAmountException(String message) {
        super(message);
    }
    
    
    
    
}
