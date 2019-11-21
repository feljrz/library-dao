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
public class ControladorCliente {
    
    private ClienteDAO daoCliente;
    
    
    public ControladorCliente(){
        daoCliente = new ClienteDAO(new RepositorioClientes("clientes.txt"));
    }
    
    public Cliente getNovoCliente(){
        return daoCliente.getNewElemento();
    }
    
    public void salvar(){
        daoCliente.salvar();
    }
    
    public List<Cliente> listarClientes(){
        return daoCliente.listaCliente();
    }
    
    public void excluir(Cliente c) throws NotFoundIDException {
        for (int x = 0; x < daoCliente.listaCliente().size(); x++) {
            if (c.getId() == daoCliente.listaCliente().get(x).getId()) {
                if(this.daoCliente.getNmrElementos()==1)
                    this.daoCliente.exclui(x);
                this.daoCliente.exclui(x+1);
            }
        }
        this.daoCliente.salvar();
    }
    
    public void inserirCliente(Cliente c){
        try {
            daoCliente.incluir(c);
        } catch (ExistingIDException ex) {
            ex.getMessage();
        }
    
    }
    
    
    
    
}
