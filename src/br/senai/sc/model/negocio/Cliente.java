package br.senai.sc.model.negocio;
import javax.persistence.Entity;

/**
 * Classe responsavél por cadastrar os dados pessoais dos clientes, contendo:
 * código do paciente, nome, sobrenome, apelido, cpf, rg, data de nascimento,
 * bairro, rua, número da casa, complemento, telefone redidencial, telefone
 * celular, telefone trabalho, email e email alteranativo.
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
