package br.senai.sc.controller;import br.senai.sc.model.negocio.Cliente;
import br.senai.sc.model.persistencia.ClienteDAOJPA;
import br.senai.sc.model.persistencia.dao.ClienteDAO;
import java.util.List;

/**
 * Classe ClienteController, nessa classe possui os métodos de inserir, editar,
 * salvar, listar todos, listar por ID e pesquisar, da determinada classe. Essa
 * classe cria um construtor, e insere o nome da classe dentro do parentese, na
 * próxima linha chama-se a classe DAO da determinada classe, e ao lado cria um
 * construtor chamando a classe DAOJPA também. Na última linha insere-se um
 * retorno com o dao.save para salvar a classe que está sendo inserida, assim
 * sucessivamente.
 *
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
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
