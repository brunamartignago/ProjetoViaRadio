package br.senai.sc.model.persistencia;
import br.senai.sc.model.negocio.Cidade;
import br.senai.sc.model.negocio.Estado;
import br.senai.sc.model.persistencia.dao.CidadeDAO;
import java.util.List;




public class CidadeDAOJPA extends DAOJPA<Cidade, Integer> implements CidadeDAO{

    @Override
    public List<Cidade> buscarEstado(Estado estado) {
       return getEntityManager().createQuery("select c from Cidade c where "
                + "c.estado.codigo = " + estado.getCodigo()).getResultList();
    }
    

}