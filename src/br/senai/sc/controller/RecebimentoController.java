package br.senai.sc.controller;

import br.senai.sc.model.negocio.Recebimento;
import br.senai.sc.model.persistencia.RecebimentoDAOJPA;
import br.senai.sc.model.persistencia.dao.RecebimentoDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class RecebimentoController {
    
    
     //Método salvar
    public Recebimento salvar(Recebimento recebimento) {
        RecebimentoDAO dao = new RecebimentoDAOJPA();
        return dao.save(recebimento);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        RecebimentoDAO dao = new RecebimentoDAOJPA();
        return dao.remove(Recebimento.class, codigo);
    }

    //Método para listar todos
    public List<Recebimento> listarRecebimento() {
        RecebimentoDAO dao = new RecebimentoDAOJPA();
        return dao.getAll(Recebimento.class);

    }

    //Método para listar por ID
    public Recebimento listarRecebimentoById(int codigo) {
        RecebimentoDAO dao = new RecebimentoDAOJPA();
        return dao.getById(Recebimento.class, codigo);

    }

    //Método para pesquisar
    public List<Recebimento> pesquisaRecebimento(String nome) {
        RecebimentoDAO dao = new RecebimentoDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
    
}
