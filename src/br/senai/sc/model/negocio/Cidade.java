package br.senai.sc.model.negocio;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 * Classe responsavél por cadastrar a cidade contendo: o código da cidade,
 * o nome e o instaciamento do estado.
 * 
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

@Entity
public class Cidade {
    
    //Inicio das variaveis
    @Id @GeneratedValue
    private int codigo;
    @ManyToOne
    private Estado estado;
    private String nome;
    //Fim das variaveis
    
    //Inicio Get e Set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //Fim do Get e Set
    @Override
    public String toString() {
        return nome;
    }

    
}
