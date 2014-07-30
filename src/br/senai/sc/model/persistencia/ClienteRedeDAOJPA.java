package br.senai.sc.model.persistencia;
import br.senai.sc.model.negocio.ClienteRede;
import br.senai.sc.model.persistencia.dao.ClienteRedeDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class ClienteRedeDAOJPA extends DAOJPA<ClienteRede, Integer> implements ClienteRedeDAO {

    @Override
    public List<ClienteRede> pesquisarNome(String nome) {
        return getEntityManager().createQuery("select cli2 from ClienteRede cli2 where "
                + "cli2.nome like '%" + nome + "%'").getResultList();
    }
    
}
