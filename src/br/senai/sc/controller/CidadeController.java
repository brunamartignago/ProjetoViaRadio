package br.senai.sc.controller;

import br.senai.sc.model.negocio.Cidade;
import br.senai.sc.model.negocio.Estado;
import br.senai.sc.model.persistencia.CidadeDAOJPA;
import br.senai.sc.model.persistencia.dao.CidadeDAO;
import java.util.List;

/**
 * Classe CidadeController, nessa classe possui os métodos de inserir, editar,
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
public class CidadeController {

    //Método para listar todos
    public List<Cidade> listarCidade() {
        CidadeDAO dao = new CidadeDAOJPA();
        return dao.getAll(Cidade.class);

    }

    //Método para listar por ID
    public Cidade listarCidadeById(int codigo) {
        CidadeDAO dao = new CidadeDAOJPA();
        return dao.getById(Cidade.class, codigo);

    }
    
    public List<Cidade> buscarEstado(Estado estado) {
        CidadeDAO dao = new CidadeDAOJPA();
        return dao.buscarEstado(estado);

    }
}
