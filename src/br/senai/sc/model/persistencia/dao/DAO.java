package br.senai.sc.model.persistencia.dao;
import java.util.List;
import javax.persistence.EntityManager;

/**
 * Interface DAO principal responsavél por possuir métodos para: salvar,
 * remover, listar por ID e listar todos.
 *
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public interface DAO<T, I> {

    
    //salvar
    T save(T entity);

    //remover
    boolean remove(Class<T> classe, I pk);

    //listar todos
    List<T> getAll(Class<T> classe);
    
    //listar por ID
    T getById(Class<T> classe, I pk);

    EntityManager getEntityManager();
    
}
