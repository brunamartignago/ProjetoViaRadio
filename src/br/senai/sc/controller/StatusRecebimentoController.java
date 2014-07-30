package br.senai.sc.controller;
import br.senai.sc.model.negocio.StatusRecebimento;
import br.senai.sc.model.persistencia.StatusRecebimentoDAOJPA;
import br.senai.sc.model.persistencia.dao.StatusRecebimentoDAO;
import java.util.List;


/**
 * Classe StatusRecebimentoController, nessa classe possui os métodos de inserir, editar,
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

public class StatusRecebimentoController {
    
    
     //Método salvar
    public StatusRecebimento salvar(StatusRecebimento statusRecebimento) {
        StatusRecebimentoDAO dao = new StatusRecebimentoDAOJPA();
        return dao.save(statusRecebimento);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        StatusRecebimentoDAO dao = new StatusRecebimentoDAOJPA();
        return dao.remove(StatusRecebimento.class, codigo);
    }

    //Método para listar todos
    public List<StatusRecebimento> listarStatusRecebimento() {
        StatusRecebimentoDAO dao = new StatusRecebimentoDAOJPA();
        return dao.getAll(StatusRecebimento.class);

    }

    //Método para listar por ID
    public StatusRecebimento listarStatusRecebimentoById(int codigo) {
        StatusRecebimentoDAO dao = new StatusRecebimentoDAOJPA();
        return dao.getById(StatusRecebimento.class, codigo);

    }

    //Método para pesquisar
    public List<StatusRecebimento> pesquisaStatusRecebimento(String nome) {
        StatusRecebimentoDAO dao = new StatusRecebimentoDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
    
    

}
