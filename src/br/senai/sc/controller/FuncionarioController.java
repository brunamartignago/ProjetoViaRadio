package br.senai.sc.controller;
import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionarioDAOJPA;
import br.senai.sc.model.persistencia.dao.FuncionarioDAO;
import java.util.List;

/**
 *
 * @author Bruna
 */

public class FuncionarioController {
    
    
     //Método salvar
    public Funcionario salvar(Funcionario funcionario) {
        FuncionarioDAO dao = new FuncionarioDAOJPA();
        return dao.save(funcionario);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        FuncionarioDAO dao = new FuncionarioDAOJPA();
        return dao.remove(Funcionario.class, codigo);
    }

    //Método para listar todos
    public List<Funcionario> listarFuncionario() {
        FuncionarioDAO dao = new FuncionarioDAOJPA();
        return dao.getAll(Funcionario.class);

    }

    //Método para listar por ID
    public Funcionario listarFuncionarioById(int codigo) {
        FuncionarioDAO dao = new FuncionarioDAOJPA();
        return dao.getById(Funcionario.class, codigo);

    }

    //Método para pesquisar
    public List<Funcionario> pesquisaFuncionario(String nome) {
        FuncionarioDAO dao = new FuncionarioDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
    
    public boolean verificaLoginSenha(String login, String senha){
        FuncionarioDAO dao = new FuncionarioDAOJPA();
        return dao.verificaLoginSenha(login, senha);
        
    }
    
}
