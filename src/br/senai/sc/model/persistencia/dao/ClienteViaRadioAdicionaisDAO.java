package br.senai.sc.model.persistencia.dao;
import br.senai.sc.model.negocio.ClienteViaRadioAdicionais;
import java.util.List;

/**
 * Interface DAO ClienteViaRadioAdicionaisDAO responsavél por extender da 
 * interface DAO principal, extender da classe ClienteViaRadioAdicionais do pacote 
 * model.negocio.
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public interface ClienteViaRadioAdicionaisDAO extends DAO<ClienteViaRadioAdicionais, Integer> {

    public List<ClienteViaRadioAdicionais> pesquisarNome(String nome);
    
}
