package br.senai.sc.controller;

import br.senai.sc.model.negocio.StatusRecebimento;
import br.senai.sc.model.persistencia.StatusRecebimentoDAOJPA;
import br.senai.sc.model.persistencia.dao.StatusRecebimentoDAO;
import java.util.List;


/**
 *
 * @author Bruna
 */

public class StatusRecebimentoController {
    
    
     //Método salvar
    public StatusRecebimento salvar(StatusRecebimento statusRecebimento) {
        StatusRecebimentoDAO dao = new StatusRecebimentoDAOJPA();
        return dao.save(statusRecebimento);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        StatusRecebimentoDAO dao = new StatusRecebimentoDAOJPA();
        return dao.remove(StatusRecebimento.class, codigo);
    }

    //Método para listar todos
    public List<StatusRecebimento> listarStatusRecebimento() {
        StatusRecebimentoDAO dao = new StatusRecebimentoDAOJPA();
        return dao.getAll(StatusRecebimento.class);

    }

    //Método para listar por ID
    public StatusRecebimento listarStatusRecebimentoById(int codigo) {
        StatusRecebimentoDAO dao = new StatusRecebimentoDAOJPA();
        return dao.getById(StatusRecebimento.class, codigo);

    }

    //Método para pesquisar
    public List<StatusRecebimento> pesquisaStatusRecebimento(String nome) {
        StatusRecebimentoDAO dao = new StatusRecebimentoDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
    
    

}
