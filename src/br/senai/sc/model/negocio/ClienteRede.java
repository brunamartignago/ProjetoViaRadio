package br.senai.sc.model.negocio;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 * Classe responsavél por cadastrar cliente em uma determinada rede contendo: o
 * código do cliente, a sequencia, a data do inicio do uso da determinada rede,
 * e o código da rede. 
 *
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

@Entity
public class ClienteRede {

    //Inicio variaveis
    @Id
    @GeneratedValue
    private int codigo;
    
    @OneToMany
    private List<Cliente> clientes;
    
    private int sequencia;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;
    
    @ManyToOne
    private SituacaoRedes situacaoRede;

    
    
    
    //Fim das variaveis
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public SituacaoRedes getSituacaoRede() {
        return situacaoRede;
    }

    public void setSituacaoRede(SituacaoRedes situacaoRede) {
        this.situacaoRede = situacaoRede;
    }
}
