package br.senai.sc.controller;
import br.senai.sc.model.negocio.SituacaoRedes;
import br.senai.sc.model.persistencia.SituacaoRedesDAOJPA;
import br.senai.sc.model.persistencia.dao.SituacaoRedesDAO;
import java.util.List;

/**
 * Classe SituacaoRedesController, nessa classe possui os métodos de inserir, editar,
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

public class SituacaoRedesController {
    
    
     //Método salvar
    public SituacaoRedes salvar(SituacaoRedes situacaoRedes) {
        SituacaoRedesDAO dao = new SituacaoRedesDAOJPA();
        return dao.save(situacaoRedes);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        SituacaoRedesDAO dao = new SituacaoRedesDAOJPA();
        return dao.remove(SituacaoRedes.class, codigo);
    }

    //Método para listar todos
    public List<SituacaoRedes> listarSituacaoRedes() {
        SituacaoRedesDAO dao = new SituacaoRedesDAOJPA();
        return dao.getAll(SituacaoRedes.class);

    }

    //Método para listar por ID
    public SituacaoRedes listarSituacaoRedesById(int codigo) {
        SituacaoRedesDAO dao = new SituacaoRedesDAOJPA();
        return dao.getById(SituacaoRedes.class, codigo);

    }

    //Método para pesquisar
    public List<SituacaoRedes> pesquisaSituacaoRedes(String nome) {
        SituacaoRedesDAO dao = new SituacaoRedesDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
}
