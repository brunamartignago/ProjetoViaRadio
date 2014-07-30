package br.senai.sc.model.negocio;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 * Classe responsavél por cadastrar as contas de rebimento, contendo:
 * o código do cliente, data de emissão, data de vencimento, valor da fatura
 * valor aberto e o status de recebimento.
 * 
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */


@Entity
public class ContaReceber {
    
    //Inicio das variaveis
    @Id @GeneratedValue
    private int codigo;
    //private Cliente cliente;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmissao;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataVencimento;
    private double valorFatura;
    private double valorAberto;

    //private StatusRecebimento statusRecebimento;
    //Fim das variaveis
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public double getValorFatura() {
        return valorFatura;
    }

    public void setValorFatura(double valorFatura) {
        this.valorFatura = valorFatura;
    }

    public double getValorAberto() {
        return valorAberto;
    }

    public void setValorAberto(double valorAberto) {
        this.valorAberto = valorAberto;
    }

}
