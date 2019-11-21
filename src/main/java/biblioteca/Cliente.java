package biblioteca;


public class Cliente extends Pessoa{

    
    public Cliente(int id, String nome, int CPF){
        super(id);
        super.setNome(nome);
        super.setCPF(CPF);
    }
    
    public Cliente(int id){
        super(id);
    }
    
    public String lista(){
        return ("ID: " + this.getId() +"Nome: "+this.getNome());
    }
}
