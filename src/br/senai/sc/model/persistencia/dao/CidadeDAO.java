package br.senai.sc.model.persistencia.dao;
import br.senai.sc.model.negocio.Cidade;
import br.senai.sc.model.negocio.Estado;
import java.util.List;



public interface CidadeDAO extends DAO<Cidade, Integer> {

    List<Cidade> buscarEstado(Estado estado);
}
