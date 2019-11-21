package biblioteca;

public abstract class Elemento {
    
    public int id;
    
    protected Elemento(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    abstract public String lista();
    
}
