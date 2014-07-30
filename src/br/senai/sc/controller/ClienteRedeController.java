package br.senai.sc.controller;

import br.senai.sc.model.negocio.ClienteRede;
import br.senai.sc.model.persistencia.ClienteRedeDAOJPA;
import br.senai.sc.model.persistencia.dao.ClienteRedeDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class ClienteRedeController {
    
    
     //Método salvar
    public ClienteRede salvar(ClienteRede clienteRede) {
        ClienteRedeDAO dao = new ClienteRedeDAOJPA();
        return dao.save(clienteRede);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        ClienteRedeDAO dao = new ClienteRedeDAOJPA();
        return dao.remove(ClienteRede.class, codigo);
    }

    //Método para listar todos
    public List<ClienteRede> listarClienteRede() {
        ClienteRedeDAO dao = new ClienteRedeDAOJPA();
        return dao.getAll(ClienteRede.class);

    }

    //Método para listar por ID
    public ClienteRede listarClienteRedeById(int codigo) {
        ClienteRedeDAO dao = new ClienteRedeDAOJPA();
        return dao.getById(ClienteRede.class, codigo);

    }

    //Método para pesquisar
    public List<ClienteRede> pesquisaClienteRede(String nome) {
        ClienteRedeDAO dao = new ClienteRedeDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
}
