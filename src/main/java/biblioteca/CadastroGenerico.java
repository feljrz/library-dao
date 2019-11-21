package biblioteca;

import java.util.ArrayList;

public abstract class CadastroGenerico<T extends Elemento> {

    private ArrayList<T> lista;
    protected RepositorioGenerico<T> rep;

    public CadastroGenerico(RepositorioGenerico<T> rp) {
        lista = new ArrayList<T>();
        this.rep = rp;

    }

    public T buscar(int index) {
        for (T e : lista) {
            if (e.getId() == index) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<T> buscaTodos() {
        return lista;
    }

   

public void exclui(int index) {
        T e = this.buscar(index);
        if (e != null)
            lista.remove(e);
    }
  
    public void incluir(T e) throws ExistingIDException{
        if(lista.contains(e)){
            throw new ExistingIDException();
        }
        if (!lista.contains(e)) {
            lista.add(e);
        }
    }
    
    public ArrayList<T> buscartodos(){
        return lista;
    }
    
    public void ler (){
        lista = rep.restaurar();
    }
     
    public void salvar() {
        rep.salvar(lista);
    }
    
    abstract public T getNewElemento();
    
    public int getNmrElementos(){
            return lista.size();
    }
}
