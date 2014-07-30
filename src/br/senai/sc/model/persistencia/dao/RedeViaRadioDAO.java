package br.senai.sc.model.persistencia.dao;
import br.senai.sc.model.negocio.RedeViaRadio;
import java.util.List;

/**
 * Interface DAO RedeViaRadioDAO responsavél por extender da 
 * interface DAO principal, extender da classe RedeViaRadio do pacote 
 * model.negocio.
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public interface RedeViaRadioDAO extends DAO<RedeViaRadio, Integer> {

    public List<RedeViaRadio> pesquisarNome(String nome);
    
}
