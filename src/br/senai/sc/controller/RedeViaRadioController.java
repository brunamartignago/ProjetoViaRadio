package br.senai.sc.controller;
import br.senai.sc.model.negocio.RedeViaRadio;
import br.senai.sc.model.persistencia.RedeViaRadioDAOJPA;
import br.senai.sc.model.persistencia.dao.RedeViaRadioDAO;
import java.util.List;

/**
 * Classe RedeViaRadioController, nessa classe possui os métodos de inserir, editar,
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

public class RedeViaRadioController {
    
    
     //Método salvar
    public RedeViaRadio salvar(RedeViaRadio redeViaRadio) {
        RedeViaRadioDAO dao = new RedeViaRadioDAOJPA();
        return dao.save(redeViaRadio);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        RedeViaRadioDAO dao = new RedeViaRadioDAOJPA();
        return dao.remove(RedeViaRadio.class, codigo);
    }

    //Método para listar todos
    public List<RedeViaRadio> listarRedeViaRadio() {
        RedeViaRadioDAO dao = new RedeViaRadioDAOJPA();
        return dao.getAll(RedeViaRadio.class);

    }

    //Método para listar por ID
    public RedeViaRadio listarRedeViaRadioById(int codigo) {
        RedeViaRadioDAO dao = new RedeViaRadioDAOJPA();
        return dao.getById(RedeViaRadio.class, codigo);

    }

    //Método para pesquisar
    public List<RedeViaRadio> pesquisaRedeViaRadio(String nome) {
        RedeViaRadioDAO dao = new RedeViaRadioDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
    
}
