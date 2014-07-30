package br.senai.sc.model.persistencia.dao;
import br.senai.sc.model.negocio.Recebimento;
import java.util.List;

/**
 * Interface DAO RecebimentoDAO responsavél por extender da 
 * interface DAO principal, extender da classe Recebimento do pacote 
 * model.negocio.
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public interface RecebimentoDAO extends DAO<Recebimento, Integer> {

    public List<Recebimento> pesquisarNome(String nome);
    
}
