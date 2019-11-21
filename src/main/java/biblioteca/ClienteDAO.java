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
public class ClienteDAO extends CadastroGenerico <Cliente>{
    
    public ClienteDAO (RepositorioGenerico<Cliente> l){
       super(l);
       this.ler();
   }
    
    public List<Cliente> listaCliente(){
       List<Cliente> lista = new ArrayList<>();
       for(Elemento x: super.buscaTodos()){
           lista.add((Cliente) x);
       }
       return lista;
   }
    
    public Cliente getNewElemento(){
       try{
            Cliente l = new Cliente(super.getNmrElementos()+1);
            this.incluir(l);
            return l;
       } catch (Exception e){
           System.err.println(e.getMessage());
       }
       return null;
    }
}
