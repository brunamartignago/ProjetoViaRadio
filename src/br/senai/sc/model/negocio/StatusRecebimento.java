package br.senai.sc.model.negocio;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

 /**
 * Classe responsavél por cadastrar o status do recebimento, contendo:
 * o código do status e o nome do status. 
 * 
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

@Entity
public class StatusRecebimento {
    
    //Inicio das variaveis
    @Id @GeneratedValue
    private int codigo;
    private String nome;
    //Fim das variaveis
    
    
    
    //Inicio Get e Set
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
   //Fim do Get e Set
}