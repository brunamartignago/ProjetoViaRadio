package br.senai.sc.model.util;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

 /**
 * Classe principal JPAUtil, responsável por fazer a conexão com
 * banco de dados. Para criação no banco usa-se o nome principal
 * que está na PERSISTENCE_UNIT.
 * 
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public class JPAUtil {
    
    
    /* Nome da unidade de persistência, que irá fazer ligação com o banco, 
     * caso inserir o nome diferente no banco, e não como está na PERSISTENCE_UNIT
     * não criara corretamente a conexão com o banco. */

private static final String PERSISTENCE_UNIT = "ProjetoViaRadioPU2";
    private EntityManagerFactory emf = null;
    private EntityManager em = null;

    public EntityManager getEntityManager() {
        if(emf == null){
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
        }
        if(em == null){
            em = emf.createEntityManager();
        }
        
        return em;
    }
}

