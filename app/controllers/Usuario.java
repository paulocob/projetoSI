package controllers;

public class Usuario {

	private String nome;
	private String login;
	private String senha;

	public Usuario(String nome, String login, String senha) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
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

	/**
	 * @ppublic java.lang.String getLogin() {
        return login;
    }aram senha the sepublic java.lang.String getSenha() {
        return senha;
    }nha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}


    
}
