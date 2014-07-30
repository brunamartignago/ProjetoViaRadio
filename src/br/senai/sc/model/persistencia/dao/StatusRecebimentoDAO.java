package br.senai.sc.model.persistencia.dao;
import br.senai.sc.model.negocio.StatusRecebimento;
import java.util.List;

/**
 * Interface DAO StatusRecebimentoDAO responsavél por extender da 
 * interface DAO principal, extender da classe StatusRecebimento do pacote 
 * model.negocio.
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public interface StatusRecebimentoDAO extends DAO<StatusRecebimento, Integer> {

    public List<StatusRecebimento> pesquisarNome(String nome);
  
}
