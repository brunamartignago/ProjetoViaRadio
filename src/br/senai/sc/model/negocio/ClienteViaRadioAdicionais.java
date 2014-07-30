package br.senai.sc.model.negocio;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Classe responsavél por cadastrar dados complementares pessoais do cliente
 * contendo: código do cliente, o endereço de MAC e o endereço de IP.
 *
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */


//@Entity
public class ClienteViaRadioAdicionais {
    
    //Inicio das variaveis
    @Id@GeneratedValue
    private int codigo;
    @ManyToOne
    private Cliente cliente;
    private String enderecoMac;
    private String enderecoIp;

    
    
    //Fim das variaveis
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getEnderecoMac() {
        return enderecoMac;
    }

    public void setEnderecoMac(String enderecoMac) {
        this.enderecoMac = enderecoMac;
    }

    public String getEnderecoIp() {
        return enderecoIp;
    }

    public void setEnderecoIp(String enderecoIp) {
        this.enderecoIp = enderecoIp;
    }
 
}
