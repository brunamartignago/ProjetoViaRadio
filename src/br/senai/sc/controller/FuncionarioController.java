package br.senai.sc.controller;
import br.senai.sc.model.negocio.Funcionario;
import br.senai.sc.model.persistencia.FuncionarioDAOJPA;
import br.senai.sc.model.persistencia.dao.FuncionarioDAO;
import java.util.List;

/**
 * Classe FuncionarioController, nessa classe possui os métodos de inserir, editar,
 * salvar, listar todos, listar por ID e pesquisar, da determinada classe. Essa
 * classe cria um construtor, e insere o nome da classe dentro do parentese, na
 * próxima linha chama-se a classe DAO da determinada classe, e ao lado cria um
 * construtor chamando a classe DAOJPA também. Na última linha insere-se um
 * retorno com o dao.save para salvar a classe que está sendo inserida, assim
 * sucessivamente.
 *
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
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
