package br.senai.sc.model.persistencia;
import br.senai.sc.model.negocio.Recebimento;
import br.senai.sc.model.persistencia.dao.RecebimentoDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class RecebimentoDAOJPA extends DAOJPA<Recebimento, Integer> implements RecebimentoDAO {

    @Override
    public List<Recebimento> pesquisarNome(String nome) {
        return getEntityManager().createQuery("select r from Recebimento r where "
                + "r.nome like '%" + nome + "%'").getResultList();
    }
    
}
