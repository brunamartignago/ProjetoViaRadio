package br.senai.sc.model.persistencia;
import br.senai.sc.model.negocio.Cargo;
import br.senai.sc.model.persistencia.dao.CargoDAO;
import java.util.List;


 /**
 * Classe DAOJPA que tem a ligação com o entity, para fazer a pesquisa
 * da determinada classe instanciada.
 * 
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public class CargoDAOJPA extends DAOJPA<Cargo, Integer> implements CargoDAO {
    

    @Override
    public List<Cargo> pesquisarNome(String nome) {
        return getEntityManager().createQuery("select ca from Cargo ca where "
                + "ca.nome like '%" + nome + "%'").getResultList();
    }
}