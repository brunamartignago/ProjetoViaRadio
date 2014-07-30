package br.senai.sc.model.negocio;
import java.util.Date;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;


/**
 * Classe responsavél por cadastrar as contas de rebimento, contendo:
 * nome, cpf, rg, data de nascimento e o telefone celular.
 * 
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */


@MappedSuperclass
public abstract class PessoaFisica extends Pessoa{
    
    //Inicio variaveis
    private String nome;
    private String cpf;
    private String rg;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    private String telefoneCelular;
    //Fim das variaveis

    
    //Inicio get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }
    //Fim do get e set

}
