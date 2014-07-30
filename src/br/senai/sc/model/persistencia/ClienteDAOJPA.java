package br.senai.sc.model.persistencia;
import br.senai.sc.model.negocio.Cliente;
import br.senai.sc.model.persistencia.dao.ClienteDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class ClienteDAOJPA extends DAOJPA<Cliente, Integer> implements ClienteDAO {

    @Override
    public List<Cliente> pesquisarNome(String nome) {
        return getEntityManager().createQuery("select cli from Cliente cli where "
                + "cli.nome like '%" + nome + "%'").getResultList();
    }
    
}
