package biblioteca;

public abstract class Pessoa extends Elemento{
    
    String nome;
    int CPF;
    
    public Pessoa(int id){
        super(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }    
}
