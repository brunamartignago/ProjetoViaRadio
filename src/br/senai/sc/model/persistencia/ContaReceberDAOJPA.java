package br.senai.sc.model.persistencia;
import br.senai.sc.model.negocio.ContaReceber;
import br.senai.sc.model.persistencia.dao.ContaReceberDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class ContaReceberDAOJPA extends DAOJPA<ContaReceber, Integer> implements ContaReceberDAO {

    @Override
    public List<ContaReceber> pesquisarNome(String nome) {
        return getEntityManager().createQuery("select cr from ContaReceber cr where "
                + "cr.nome like '%" + nome + "%'").getResultList();
    }
    
}
