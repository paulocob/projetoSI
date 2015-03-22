package controllers;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
public class Usuario {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	private String nome;
	private String login;
	private String senha;

    public Usuario(){}


	public Usuario(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
	}

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    /**
	 * @param nome the nome to set
	 */

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


    
}
