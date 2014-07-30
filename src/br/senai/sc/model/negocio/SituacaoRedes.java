package br.senai.sc.model.negocio;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Classe responsavél por cadastrar as situações das redes, contendo:
 * o código da situação e o nome da situação.
 * 
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

@Entity
public class SituacaoRedes {
    
    //Inicio das variaveis
    @Id @GeneratedValue
    private int codigo;
    private String nomeSituacao;
    //Fim das variaveis
    
    
    //Inicio Get e Set
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeSituacao() {
        return nomeSituacao;
    }

    public void setNomeSituacao(String nomeSituacao) {
        this.nomeSituacao = nomeSituacao;
    }
    //Fim Get e Set
}
