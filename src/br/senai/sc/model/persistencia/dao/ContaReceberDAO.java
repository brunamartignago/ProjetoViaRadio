package br.senai.sc.model.persistencia.dao;
import br.senai.sc.model.negocio.ContaReceber;
import java.util.List;

/**
 * Interface DAO ContaReceberDAO responsavél por extender da 
 * interface DAO principal, extender da classe ContaReceber do pacote 
 * model.negocio.
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public interface ContaReceberDAO extends DAO<ContaReceber, Integer> {

    public List<ContaReceber> pesquisarNome(String nome);
    
}
