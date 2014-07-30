package br.senai.sc.controller;
import br.senai.sc.model.negocio.ClienteRede;
import br.senai.sc.model.persistencia.ClienteRedeDAOJPA;
import br.senai.sc.model.persistencia.dao.ClienteRedeDAO;
import java.util.List;

/**
 * Classe ClienteRedeController, nessa classe possui os métodos de inserir, editar,
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
