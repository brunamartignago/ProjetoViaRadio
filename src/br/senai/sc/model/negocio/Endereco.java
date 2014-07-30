package br.senai.sc.model.negocio;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 * Classe responsavél por cadastrar o endereço, contendo:
 * código do endereço, instanciamento da cidade, instanciamento do estado,
 * o cep, bairro, rua, número da casa e o complemento.
 * 
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */


@Entity
public class Endereco {

    //Inicio das variaveis
    @Id
    @GeneratedValue
    private int codigo;
    @ManyToOne
    private Cidade cidade;
    
    @ManyToOne
    private Estado estado;
    
    private String CEP;
    private String bairro;
    private String rua;
    private String numeroCasa;
    private String complemento;
    //Fim das variaveis

    
    //Inicio get e set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    //Fim do get e set
    
    
}
