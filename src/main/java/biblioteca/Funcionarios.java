package biblioteca;

import biblioteca.Pessoa;

public class Funcionarios extends Pessoa{
    
    public double salario;
    public int idade;
    
    public Funcionarios(int id, String nome, int CPF){
        super(id);
        super.setNome(nome);
        super.setCPF(CPF);
    }
    
    public Funcionarios(int id){
        super(id);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String lista(){
        return ("ID: " + this.getId() +"Nome: "+this.getNome());
    }
    
}
