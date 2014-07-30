package br.senai.sc.controller;

import br.senai.sc.model.negocio.SituacaoRedes;
import br.senai.sc.model.persistencia.SituacaoRedesDAOJPA;
import br.senai.sc.model.persistencia.dao.SituacaoRedesDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class SituacaoRedesController {
    
    
     //Método salvar
    public SituacaoRedes salvar(SituacaoRedes situacaoRedes) {
        SituacaoRedesDAO dao = new SituacaoRedesDAOJPA();
        return dao.save(situacaoRedes);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        SituacaoRedesDAO dao = new SituacaoRedesDAOJPA();
        return dao.remove(SituacaoRedes.class, codigo);
    }

    //Método para listar todos
    public List<SituacaoRedes> listarSituacaoRedes() {
        SituacaoRedesDAO dao = new SituacaoRedesDAOJPA();
        return dao.getAll(SituacaoRedes.class);

    }

    //Método para listar por ID
    public SituacaoRedes listarSituacaoRedesById(int codigo) {
        SituacaoRedesDAO dao = new SituacaoRedesDAOJPA();
        return dao.getById(SituacaoRedes.class, codigo);

    }

    //Método para pesquisar
    public List<SituacaoRedes> pesquisaSituacaoRedes(String nome) {
        SituacaoRedesDAO dao = new SituacaoRedesDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
}
