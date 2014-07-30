package br.senai.sc.model.persistencia;
import br.senai.sc.model.negocio.RedeViaRadio;
import br.senai.sc.model.persistencia.dao.RedeViaRadioDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class RedeViaRadioDAOJPA extends DAOJPA<RedeViaRadio, Integer> implements RedeViaRadioDAO {

    @Override
    public List<RedeViaRadio> pesquisarNome(String nome) {
        return getEntityManager().createQuery("select rvr from RedeViaRadio rvr where "
                + "rvr.nome like '%" + nome + "%'").getResultList();
    }
    
}
