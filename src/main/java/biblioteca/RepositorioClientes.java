package biblioteca;

import static java.lang.Integer.parseInt;

import java.util.StringTokenizer;


public class RepositorioClientes extends RepositorioGenerico<Cliente>{
    
    public RepositorioClientes(String file){
        super(file);
    }
    
    public String getRegistro(Cliente e){
        return (e.getId()+SEPARATOR+e.getNome()+SEPARATOR+e.getCPF());
    }
    
    public Cliente getInstance(String str){
        StringTokenizer stk = new StringTokenizer(str,SEPARATOR);
        int id = parseInt(stk.nextToken());
        String nome = stk.nextToken();
        int cpf = parseInt(stk.nextToken());
        Cliente c = new Cliente(id,nome,cpf);
        return c;
    }
}
