package biblioteca;

public class ExistingIDException extends Exception{
    
    public ExistingIDException(){
        super("ID já existente!");
    }
    
}
