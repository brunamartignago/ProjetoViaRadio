package br.senai.sc.model.persistencia;
import br.senai.sc.model.negocio.ClienteViaRadioAdicionais;
import br.senai.sc.model.persistencia.dao.ClienteViaRadioAdicionaisDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class ClienteViaRadioAdicionaisDAOJPA extends DAOJPA<ClienteViaRadioAdicionais, Integer> implements ClienteViaRadioAdicionaisDAO {

    @Override
    public List<ClienteViaRadioAdicionais> pesquisarNome(String nome) {
        return getEntityManager().createQuery("select cli4 from ClienteViaRadioAdicionais cli4 where "
                + "cli4.nome like '%" + nome + "%'").getResultList();
    }
    
}
