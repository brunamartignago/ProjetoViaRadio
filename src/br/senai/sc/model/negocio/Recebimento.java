package br.senai.sc.model.negocio;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;


/**
 * Classe responsavél por cadastrar o recebimento das mensalidades, contendo:
 * o código da fatura, o instanciamento da classe Cliente Rede Fatura trazendo o id
 * do cliente rede, sequencia, data de recebimento e o valor.
 * 
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

@Entity
public class Recebimento {
    
    //Inicio das variaveis
    @Id @GeneratedValue
    private int codigo;
    //private ClienteRedeFatura clienteRedeFatura;
    private int sequencia;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataRecebimento;
    private double valor;
    //Fim das variaveis
    
    
    //Inicio get e set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

    public Date getDataRecebimento() {
        return dataRecebimento;
    }

    public void setDataRecebimento(Date dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    //Fim do get e set

}
