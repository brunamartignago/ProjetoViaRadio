package br.senai.sc.controller;
import br.senai.sc.model.negocio.ClienteViaRadioAdicionais;
import br.senai.sc.model.persistencia.ClienteViaRadioAdicionaisDAOJPA;
import br.senai.sc.model.persistencia.dao.ClienteViaRadioAdicionaisDAO;
import java.util.List;

/**
 *
 * @author Bruna
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
