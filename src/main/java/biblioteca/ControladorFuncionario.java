/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import biblioteca.FuncionariosDAO;
import biblioteca.NotFoundIDException;
import biblioteca.RepositorioFuncionarios;
import java.util.List;

/**
 *
 * @author Felipe
 */
public class ControladorFuncionario {

    private FuncionariosDAO daoFuncionarios;

    public ControladorFuncionario() {
        daoFuncionarios = new FuncionariosDAO(new RepositorioFuncionarios("funcionarios.txt"));
    }

    public Funcionarios getNovoFuncionarios() {
        return daoFuncionarios.getNewElemento();
    }

    public void salvar() {
        daoFuncionarios.salvar();
    }

    public List<Funcionarios> listarFuncionarios() {
        return daoFuncionarios.listaFuncionarios();
    }

    public void excluir(Funcionarios f) throws NotFoundIDException {
        for (int x = 0; x < daoFuncionarios.listaFuncionarios().size(); x++) {
            if (f.getId() == daoFuncionarios.listaFuncionarios().get(x).getId()) {
                if(this.daoFuncionarios.getNmrElementos()==1)
                    this.daoFuncionarios.exclui(x);
                this.daoFuncionarios.exclui(x+1);
            }
        }
        this.daoFuncionarios.salvar();
    }

    public void inserirFuncionarios(Funcionarios c) {
        try {
            daoFuncionarios.incluir(c);
        } catch (ExistingIDException ex) {
            ex.getMessage();
        }

    }

}
