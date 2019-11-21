/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonio
 */
public class FuncionariosDAO extends CadastroGenerico <Funcionarios>{
    
    public FuncionariosDAO (RepositorioGenerico<Funcionarios> l){
       super(l);
       this.ler();
   }
    
    public List<Funcionarios> listaFuncionarios(){
       List<Funcionarios> lista = new ArrayList<>();
       for(Elemento x: super.buscaTodos()){
           lista.add((Funcionarios) x);
       }
       return lista;
   }
   
   public Funcionarios getNewElemento(){
       try{
            Funcionarios l = new Funcionarios(super.getNmrElementos()+1);
            this.incluir(l);
            return l;
       } catch (Exception e){
           e.getMessage();
           System.out.println("Não foi possivel adicionar um novo Funcionario");
       }
       return null;
   }

    
    @Override
   public void exclui(int index) {
       super.exclui(index);
    }
}
