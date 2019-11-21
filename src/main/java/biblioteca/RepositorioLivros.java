package biblioteca;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.StringTokenizer;

public class RepositorioLivros extends RepositorioGenerico<Livro> {
    
    public RepositorioLivros(String filename){
        super(filename);
    }
    
    public String getRegistro(Livro e) {
        String registro = e.getId() + SEPARATOR
                + e.getNome() + SEPARATOR
                + e.getAutor() + SEPARATOR
                + e.getPreco() + SEPARATOR
                + e.getQuantidade() + SEPARATOR;
        return registro;

    }
    
    public Livro getInstance(String str){
        StringTokenizer stk = new StringTokenizer(str,SEPARATOR);
        int id = parseInt(stk.nextToken());
        Livro l1 = new Livro(id);
        l1.setNome(stk.nextToken());
        l1.setAutor(stk.nextToken());
        double preco = parseDouble(stk.nextToken());
        l1.setPreco(preco);
        int qtd = parseInt(stk.nextToken());
        l1.setQuantidade(qtd);
        return l1;
        }
}
