package br.senai.sc.controller;

import br.senai.sc.model.negocio.ClienteRedeFatura;
import br.senai.sc.model.persistencia.ClienteRedeFaturaDAOJPA;
import br.senai.sc.model.persistencia.dao.ClienteRedeFaturaDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class ClienteRedeFaturaController {

    
     //Método salvar
    public ClienteRedeFatura salvar(ClienteRedeFatura clienteRedeFatura) {
        ClienteRedeFaturaDAO dao = new ClienteRedeFaturaDAOJPA();
        return dao.save(clienteRedeFatura);    
    }

    //Método excluir
    public boolean excluir(int codigo) {
        ClienteRedeFaturaDAO dao = new ClienteRedeFaturaDAOJPA();
        return dao.remove(ClienteRedeFatura.class, codigo);
    }

    //Método para listar todos
    public List<ClienteRedeFatura> listarClienteRedeFatura() {
        ClienteRedeFaturaDAO dao = new ClienteRedeFaturaDAOJPA();
        return dao.getAll(ClienteRedeFatura.class);

    }

    //Método para listar por ID
    public ClienteRedeFatura listarClienteRedeFaturaById(int codigo) {
        ClienteRedeFaturaDAO dao = new ClienteRedeFaturaDAOJPA();
        return dao.getById(ClienteRedeFatura.class, codigo);

    }

    //Método para pesquisar
    public List<ClienteRedeFatura> pesquisaClienteRedeFatura(String nome) {
        ClienteRedeFaturaDAO dao = new ClienteRedeFaturaDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
}
