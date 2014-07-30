package br.senai.sc.model.persistencia;
import br.senai.sc.model.negocio.ClienteRedeFatura;
import br.senai.sc.model.persistencia.dao.ClienteRedeFaturaDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class ClienteRedeFaturaDAOJPA extends DAOJPA<ClienteRedeFatura, Integer> implements ClienteRedeFaturaDAO {

    @Override
    public List<ClienteRedeFatura> pesquisarNome(String nome) {
        return getEntityManager().createQuery("select cli3 from ClienteRedeFatura cli3 where "
                + "cli3.nome like '%" + nome + "%'").getResultList();
    }
    
}
