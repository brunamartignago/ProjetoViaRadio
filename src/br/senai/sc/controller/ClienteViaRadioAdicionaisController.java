package br.senai.sc.controller;
import br.senai.sc.model.negocio.ClienteViaRadioAdicionais;
import br.senai.sc.model.persistencia.ClienteViaRadioAdicionaisDAOJPA;
import br.senai.sc.model.persistencia.dao.ClienteViaRadioAdicionaisDAO;
import java.util.List;

/**
 * Classe ClienteViaRadioAdicionaisController, nessa classe possui os métodos de inserir, editar,
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

public class ClienteViaRadioAdicionaisController {
    
    
     //Método salvar
    public ClienteViaRadioAdicionais salvar(ClienteViaRadioAdicionais clienteViaRadio) {
        ClienteViaRadioAdicionaisDAO dao = new ClienteViaRadioAdicionaisDAOJPA();
        return dao.save(clienteViaRadio);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        ClienteViaRadioAdicionaisDAO dao = new ClienteViaRadioAdicionaisDAOJPA();
        return dao.remove(ClienteViaRadioAdicionais.class, codigo);
    }

    //Método para listar todos
    public List<ClienteViaRadioAdicionais> listarClienteViaRadio() {
        ClienteViaRadioAdicionaisDAO dao = new ClienteViaRadioAdicionaisDAOJPA();
        return dao.getAll(ClienteViaRadioAdicionais.class);

    }

    //Método para listar por ID
    public ClienteViaRadioAdicionais listarClienteViaRadioById(int codigo) {
        ClienteViaRadioAdicionaisDAO dao = new ClienteViaRadioAdicionaisDAOJPA();
        return dao.getById(ClienteViaRadioAdicionais.class, codigo);

    }

    //Método para pesquisar
    public List<ClienteViaRadioAdicionais> pesquisaClienteViaRadio(String nome) {
        ClienteViaRadioAdicionaisDAO dao = new ClienteViaRadioAdicionaisDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
    
}
