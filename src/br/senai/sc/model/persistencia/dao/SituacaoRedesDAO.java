package br.senai.sc.model.persistencia.dao;
import br.senai.sc.model.negocio.SituacaoRedes;
import java.util.List;

/**
 * Interface DAO SituacaoRedesDAO responsavél por extender da 
 * interface DAO principal, extender da classe SituacaoRedes do pacote 
 * model.negocio.
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public interface SituacaoRedesDAO extends DAO<SituacaoRedes, Integer> {

    public List<SituacaoRedes> pesquisarNome(String nome);
    
}
