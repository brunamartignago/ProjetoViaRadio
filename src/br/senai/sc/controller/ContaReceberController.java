package br.senai.sc.controller;
import br.senai.sc.model.negocio.ContaReceber;
import br.senai.sc.model.persistencia.ContaReceberDAOJPA;
import br.senai.sc.model.persistencia.dao.ContaReceberDAO;
import java.util.List;

/**
 * Classe ContaReceberController, nessa classe possui os métodos de inserir, editar,
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

public class ContaReceberController {
    
    
     //Método salvar
    public ContaReceber salvar(ContaReceber contaReceber) {
        ContaReceberDAO dao = new ContaReceberDAOJPA();
        return dao.save(contaReceber);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        ContaReceberDAO dao = new ContaReceberDAOJPA();
        return dao.remove(ContaReceber.class, codigo);
    }

    //Método para listar todos
    public List<ContaReceber> listarContaReceber() {
        ContaReceberDAO dao = new ContaReceberDAOJPA();
        return dao.getAll(ContaReceber.class);

    }

    //Método para listar por ID
    public ContaReceber listarContaReceberById(int codigo) {
        ContaReceberDAO dao = new ContaReceberDAOJPA();
        return dao.getById(ContaReceber.class, codigo);

    }

    //Método para pesquisar
    public List<ContaReceber> pesquisaContaReceber(String nome) {
        ContaReceberDAO dao = new ContaReceberDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
    
}
