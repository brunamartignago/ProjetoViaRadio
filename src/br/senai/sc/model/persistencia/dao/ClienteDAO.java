package br.senai.sc.model.persistencia.dao;
import br.senai.sc.model.negocio.Cliente;
import java.util.List;

/**
 * Interface DAO ClienteDAO responsavél por extender da 
 * interface DAO principal, extender da classe Cliente do pacote 
 * model.negocio.
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public interface ClienteDAO extends DAO<Cliente, Integer> {

    public List<Cliente> pesquisarNome(String nome);
    
}
