package br.senai.sc.model.negocio;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

/**
 * Classe responsavél por cadastrar o cargo dos funcionários, contendo:
 * código do cargo, nome, descrição, valor estimado e carga horária.
 * 
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

@Entity
public class Cargo {
    
    //Inicio das variaveis
    @Id @GeneratedValue
    private int codigo;
    private String nome;
    @Lob
    private String descricao;
    private double valor;
    private String cargaHoraria;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //Fim Get e Set
    @Override
    public String toString() {
        return nome ;
    }
    
   
}
