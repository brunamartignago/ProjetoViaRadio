package br.senai.sc.model.negocio;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe responsavél por cadastrar tipos de rede, contendo: código da rede,
 * nome, situação da rede(Disponível/Indisponível/Outros), quantidade de vagas
 * disponíveis, valor da mensalidade da rede.
 *
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */


//@Entity
public class RedeViaRadio {
    
    //Inicio das variaveis
    @Id
    @GeneratedValue
    private int codigo;
    private String nome;
    private String situacao;
    private int quantidadeVaga;
    private double valor;
    //Fim das variáveis
     
    
    //Inicio get e set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getQuantidadeVaga() {
        return quantidadeVaga;
    }

    public void setQuantidadeVaga(int quantidadeVaga) {
        this.quantidadeVaga = quantidadeVaga;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    //Fim get e set
}
