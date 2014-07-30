package br.senai.sc.model.persistencia;
import br.senai.sc.model.negocio.StatusRecebimento;
import br.senai.sc.model.persistencia.dao.StatusRecebimentoDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class StatusRecebimentoDAOJPA extends DAOJPA<StatusRecebimento, Integer> implements StatusRecebimentoDAO {

    @Override
    public List<StatusRecebimento> pesquisarNome(String nome) {
        return getEntityManager().createQuery("select sr from StatusRecebimento sr where "
                + "sr.nome like '%" + nome + "%'").getResultList();
    }
    
}
