package br.senai.sc.controller;
import br.senai.sc.model.negocio.Recebimento;
import br.senai.sc.model.persistencia.RecebimentoDAOJPA;
import br.senai.sc.model.persistencia.dao.RecebimentoDAO;
import java.util.List;

/**
 * Classe RecebimentoController, nessa classe possui os métodos de inserir, editar,
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

public class RecebimentoController {
    
    
     //Método salvar
    public Recebimento salvar(Recebimento recebimento) {
        RecebimentoDAO dao = new RecebimentoDAOJPA();
        return dao.save(recebimento);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        RecebimentoDAO dao = new RecebimentoDAOJPA();
        return dao.remove(Recebimento.class, codigo);
    }

    //Método para listar todos
    public List<Recebimento> listarRecebimento() {
        RecebimentoDAO dao = new RecebimentoDAOJPA();
        return dao.getAll(Recebimento.class);

    }

    //Método para listar por ID
    public Recebimento listarRecebimentoById(int codigo) {
        RecebimentoDAO dao = new RecebimentoDAOJPA();
        return dao.getById(Recebimento.class, codigo);

    }

    //Método para pesquisar
    public List<Recebimento> pesquisaRecebimento(String nome) {
        RecebimentoDAO dao = new RecebimentoDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
    
}
