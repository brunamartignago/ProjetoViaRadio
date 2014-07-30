package br.senai.sc.model.persistencia.dao;
import br.senai.sc.model.negocio.Funcionario;
import java.util.List;

/**
 * Interface DAO FuncionarioDAO responsavél por extender da 
 * interface DAO principal, extender da classe Funcionario do pacote 
 * model.negocio.
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public interface FuncionarioDAO extends DAO<Funcionario, Integer> {

    public List<Funcionario> pesquisarNome(String nome);
    
    public boolean verificaLoginSenha(String login, String senha);
    
}
