package br.senai.sc.controller;

import br.senai.sc.model.negocio.ContaReceber;
import br.senai.sc.model.persistencia.ContaReceberDAOJPA;
import br.senai.sc.model.persistencia.dao.ContaReceberDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class ContaReceberController {
    
    
     //Método salvar
    public ContaReceber salvar(ContaReceber contaReceber) {
        ContaReceberDAO dao = new ContaReceberDAOJPA();
        return dao.save(contaReceber);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        ContaReceberDAO dao = new ContaReceberDAOJPA();
        return dao.remove(ContaReceber.class, codigo);
    }

    //Método para listar todos
    public List<ContaReceber> listarContaReceber() {
        ContaReceberDAO dao = new ContaReceberDAOJPA();
        return dao.getAll(ContaReceber.class);

    }

    //Método para listar por ID
    public ContaReceber listarContaReceberById(int codigo) {
        ContaReceberDAO dao = new ContaReceberDAOJPA();
        return dao.getById(ContaReceber.class, codigo);

    }

    //Método para pesquisar
    public List<ContaReceber> pesquisaContaReceber(String nome) {
        ContaReceberDAO dao = new ContaReceberDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
    
}
