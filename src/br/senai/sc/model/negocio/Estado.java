package br.senai.sc.model.negocio;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe responsavél por cadastrar o estado contendo: o código do estado,
 * nome e a abreviação do estado.
 *
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

@Entity 
public class Estado {
    
    //Inicio das variaveis
    @Id @GeneratedValue
    private int codigo;
    private String nome;
    private String abreviacao;
    //Fim das variaveis

    
    
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

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    

}
