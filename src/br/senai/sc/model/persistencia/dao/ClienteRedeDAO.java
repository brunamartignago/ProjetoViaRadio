package br.senai.sc.model.persistencia.dao;
import br.senai.sc.model.negocio.ClienteRede;
import java.util.List;

/**
 * Interface DAO ClienteRedeDAO responsavél por extender da 
 * interface DAO principal, extender da classe ClienteRede do pacote 
 * model.negocio.
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public interface ClienteRedeDAO extends DAO<ClienteRede, Integer> {

    public List<ClienteRede> pesquisarNome(String nome);
    
}
