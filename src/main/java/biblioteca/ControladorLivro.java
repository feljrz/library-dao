/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Felipe
 */
public class ControladorLivro {

    private LivroDAO daoLivro;

    public ControladorLivro() {
        daoLivro = new LivroDAO(new RepositorioLivros("livros.txt"));
    }

    public Livro getNovoLivro() {
        return daoLivro.getNewElemento();

    }

    public void inserirLivro(Livro livro) {
        try {
            daoLivro.incluir(livro);
        } catch (ExistingIDException ex) {
            ex.getMessage();
        }
    }
    
    public void excluir(Livro l) throws NotFoundIDException {
        for (int x = 0; x < daoLivro.listaLivros().size(); x++) {
            if (l.getId() == daoLivro.listaLivros().get(x).getId()) {
                if(this.daoLivro.getNmrElementos()==1)
                    this.daoLivro.exclui(x);
                this.daoLivro.exclui(x+1);
            }
        }
        this.daoLivro.salvar();
    }

   public void salvar(){
       daoLivro.salvar();
   
   }
   
   public List<Livro> listarLivros(){
       return daoLivro.listaLivros();
   }
    
    
    
    
}
