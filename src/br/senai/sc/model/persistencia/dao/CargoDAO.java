package br.senai.sc.model.persistencia.dao;
import br.senai.sc.model.negocio.Cargo;
import java.util.List;

/**
 * Interface DAO CargoDAO responsavél por extender da 
 * interface DAO principal, extender da classe Cargo do pacote 
 * model.negocio.
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public interface CargoDAO extends DAO<Cargo, Integer> {

    public List<Cargo> pesquisarNome(String nome);
    
}
