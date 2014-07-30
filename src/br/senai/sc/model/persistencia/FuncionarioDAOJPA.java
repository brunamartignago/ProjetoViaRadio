package br.senai.sc.model.persistencia;

import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.dao.FuncionarioDAO;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Bruna
 */
public class FuncionarioDAOJPA extends DAOJPA<Funcionario, Integer> implements FuncionarioDAO {

    @Override
    public List<Funcionario> pesquisarNome(String nome) {
        return getEntityManager().createQuery("select f from Funcionario f where "
                + "f.nome like '%" + nome + "%'").getResultList();
    }

    @Override
    public boolean verificaLoginSenha(String login, String senha) {

        Query q = getEntityManager().createQuery("select x from Funcionario x where x.login =:login and x.senha =:senha", Funcionario.class);
        q.setParameter("senha", senha);
        q.setParameter("login", login);
        if (q.getResultList().size() > 0) {
            return true;
        }
        return false;
    }
}
