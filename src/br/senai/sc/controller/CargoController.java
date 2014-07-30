package br.senai.sc.controller;
import br.senai.sc.model.negocio.Cargo;
import br.senai.sc.model.persistencia.CargoDAOJPA;
import br.senai.sc.model.persistencia.dao.CargoDAO;
import java.util.List;

/**
 * Classe CargoController, nessa classe possui os métodos de inserir, editar,
 * salvar, listar todos, listar por ID e pesquisar, da determinada classe.
 * Essa classe cria um construtor, e insere o nome da classe dentro do parentese,
 * na próxima linha chama-se a classe DAO da determinada classe, e ao lado cria um construtor chamando
 * a classe DAOJPA também. Na última linha insere-se um retorno com o dao.save para salvar a
 * classe que está sendo inserida, assim sucessivamente.
 *
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

public class CargoController {


    //Método salvar
    public Cargo salvar(Cargo cargo) {
        CargoDAO dao = new CargoDAOJPA();
        return dao.save(cargo);
    }

    //Método excluir
    public boolean excluir(int codigo) {
        CargoDAO dao = new CargoDAOJPA();
        return dao.remove(Cargo.class, codigo);
    }

    //Método para listar todos
    public List<Cargo> listarCargo() {
        CargoDAO dao = new CargoDAOJPA();
        return dao.getAll(Cargo.class);

    }

    //Método para listar por ID
    public Cargo listarCargoById(int codigo) {
        CargoDAO dao = new CargoDAOJPA();
        return dao.getById(Cargo.class, codigo);

    }

    //Método para pesquisar
    public List<Cargo> pesquisaCargo(String nome) {
        CargoDAO dao = new CargoDAOJPA();
        return dao.pesquisarNome(nome);
  
    }
}
