package br.senai.sc.model.negocio;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;


/**
 * Classe responsavél por cadastrar Pessoa, contendo:
 * o código do cliente, telefone residencial, email e o instanciamento
 * do da classe endereço.
 * 
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */


@MappedSuperclass
public abstract class Pessoa {

    //Inicio variaveis
    @Id
    @GeneratedValue
    private int codigo;
    private String telefoneResidencial;
    private String email;
    
    @OneToOne (cascade = CascadeType.ALL)
    private Endereco endereco;
    //Fim das variaveis

    
    //Inicio get e set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefoneResidencial() {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    //Fim get e set

}
