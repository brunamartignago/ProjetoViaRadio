package br.senai.sc.controller;
import br.senai.sc.model.negocio.ClienteRedeFatura;
import br.senai.sc.model.persistencia.ClienteRedeFaturaDAOJPA;
import br.senai.sc.model.persistencia.dao.ClienteRedeFaturaDAO;
import java.util.List;

/**
 * Classe ClienteRedeFaturaController, nessa classe possui os métodos de inserir, editar,
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
