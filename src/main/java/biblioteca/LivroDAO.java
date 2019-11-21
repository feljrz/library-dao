package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class LivroDAO extends CadastroGenerico <Livro> {
    
   public LivroDAO (RepositorioGenerico<Livro> l){
       super(l);
       this.ler();
   }
   
   public List<Livro> listaLivros(){
       List<Livro> lista = new ArrayList<>();
       for(Elemento x: super.buscaTodos()){
           lista.add((Livro) x);
       }
       return lista;
   }
   
   public Livro getNewElemento(){
       try{
            Livro l = new Livro(super.getNmrElementos()+1);
            this.incluir(l);
            return l;
       } catch (Exception e){
           System.err.println(e.getMessage());
       }
       return null;
   } 
}