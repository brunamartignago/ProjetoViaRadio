package br.senai.sc.controller;import br.senai.sc.model.negocio.Cliente;
import br.senai.sc.model.persistencia.ClienteDAOJPA;
import br.senai.sc.model.persistencia.dao.ClienteDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class ClienteController {
    
    
     //Método salvar
    public Cliente salvar(Cliente cliente) {
        ClienteDAO dao = new ClienteDAOJPA();
        return dao.save(cliente);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        ClienteDAO dao = new ClienteDAOJPA();
        return dao.remove(Cliente.class, codigo);
    }

    //Método para listar todos
    public List<Cliente> listarCliente() {
        ClienteDAO dao = new ClienteDAOJPA();
        return dao.getAll(Cliente.class);

    }

    //Método para listar por ID
    public Cliente listarClienteById(int codigo) {
        ClienteDAO dao = new ClienteDAOJPA();
        return dao.getById(Cliente.class, codigo);

    }

    //Método para pesquisar
    public List<Cliente> pesquisaCliente(String nome) {
        ClienteDAO dao = new ClienteDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
}
