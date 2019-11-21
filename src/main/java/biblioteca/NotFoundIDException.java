package biblioteca;

public class NotFoundIDException extends Exception {
    
    public NotFoundIDException(){
        super("ID não encontrado!");
    }
    
}
