package br.senai.sc.model.negocio;
import javax.persistence.Entity;

/**
 * Classe responsavél por cadastrar os dados pessoais dos clientes, contendo:
 * telefone trabalho e email alteranativo, o resto dos dados
 * é extendido da classe Pessoa Fisica.
 *
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

@Entity
public class Cliente extends PessoaFisica {

    // Inicio das variaveis
    private String telefoneTrabalho;
    private String emailAlternativo;

    
    
    public String getTelefoneTrabalho() {
        return telefoneTrabalho;
    }
    
    public void setTelefoneTrabalho(String telefoneTrabalho) {
        this.telefoneTrabalho = telefoneTrabalho;
    }

    public String getEmailAlternativo() {
        return emailAlternativo;
    }

    public void setEmailAlternativo(String emailAlternativo) {
        this.emailAlternativo = emailAlternativo;
    }
   
}
