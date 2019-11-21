
package biblioteca;

public class Livro extends Elemento{
    
    public String nome;
    public String autor;
    public int quantidade;
    public double preco;
    
    public Livro(int id){
        super(id);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String lista(){
        return("ID: " + this.getId() +"Nome: "+this.getNome());
    }
}
