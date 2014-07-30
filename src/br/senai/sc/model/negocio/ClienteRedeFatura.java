package br.senai.sc.model.negocio;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 * Classe responsavél por cadastrar o cliente na fatura recebida, contendo:
 * o código do cliente, a sequencia, o número da fatura, a data de emissão e a data 
 * de vencimento da fatura.
 *
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

@Entity
public class ClienteRedeFatura { 
    
    //Inicio das variaveis
    @Id @GeneratedValue
    private int codigo;
    private int fatura;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmissao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataVencimento;

    //Fim das variaveis
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getFatura() {
        return fatura;
    }

    public void setFatura(int fatura) {
        this.fatura = fatura;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

}
