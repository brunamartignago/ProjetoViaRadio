package br.senai.sc.model.persistencia.dao;
import br.senai.sc.model.negocio.ClienteRedeFatura;
import java.util.List;

/**
 * Interface DAO ClienteRedeFaturaDAO responsavél por extender da 
 * interface DAO principal, extender da classe ClienteRedeFaturaDAO do pacote 
 * model.negocio.
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public interface ClienteRedeFaturaDAO extends DAO<ClienteRedeFatura, Integer> {

    public List<ClienteRedeFatura> pesquisarNome(String nome);
    
}
