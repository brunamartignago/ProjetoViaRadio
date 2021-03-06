package br.senai.sc.model.negocio;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 * Classe responsavél por cadastrar os dados pessoais do funcionário contendo:
 * apelido, login, senha e o instanciamento do cargo. O restante dos dados
 * é extendido da classe Pessoa Fisica.
 * 
 * @author Bruna Zakrzeski
 * @since 1.0
 * @version 1.0 07/08/2014
 */

@Entity
public class Funcionario extends PessoaFisica {

    
    //Inicio das variaveis
    private String apelido;
    @Column (unique = true)
    private String login;
    private String senha;
    @ManyToOne
    private Cargo cargo;
    
    
    
    //Inicio Get e Set
    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    //Fim do Get e Set
}
