package br.senai.sc.model.persistencia;
import br.senai.sc.model.negocio.SituacaoRedes;
import br.senai.sc.model.persistencia.dao.SituacaoRedesDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class SituacaoRedesDAOJPA extends DAOJPA<SituacaoRedes, Integer> implements SituacaoRedesDAO {

    @Override
    public List<SituacaoRedes> pesquisarNome(String nome) {
        return getEntityManager().createQuery("select sr2 from SituacaoRedes sr2 where "
                + "sr2.nomeSituacao like '%" + nome + "%'").getResultList();
    }
    
}
