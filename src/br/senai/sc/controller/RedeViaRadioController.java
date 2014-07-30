package br.senai.sc.controller;
import br.senai.sc.model.negocio.RedeViaRadio;
import br.senai.sc.model.persistencia.RedeViaRadioDAOJPA;
import br.senai.sc.model.persistencia.dao.RedeViaRadioDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class RedeViaRadioController {
    
    
     //Método salvar
    public RedeViaRadio salvar(RedeViaRadio redeViaRadio) {
        RedeViaRadioDAO dao = new RedeViaRadioDAOJPA();
        return dao.save(redeViaRadio);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        RedeViaRadioDAO dao = new RedeViaRadioDAOJPA();
        return dao.remove(RedeViaRadio.class, codigo);
    }

    //Método para listar todos
    public List<RedeViaRadio> listarRedeViaRadio() {
        RedeViaRadioDAO dao = new RedeViaRadioDAOJPA();
        return dao.getAll(RedeViaRadio.class);

    }

    //Método para listar por ID
    public RedeViaRadio listarRedeViaRadioById(int codigo) {
        RedeViaRadioDAO dao = new RedeViaRadioDAOJPA();
        return dao.getById(RedeViaRadio.class, codigo);

    }

    //Método para pesquisar
    public List<RedeViaRadio> pesquisaRedeViaRadio(String nome) {
        RedeViaRadioDAO dao = new RedeViaRadioDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
    
}
