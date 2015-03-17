package controllers;

public class Sistema {
	
	
	public void cadastrarUsuario(String nome, String login, String senha){
		Usuario usuario = new Usuario(nome,login,senha);
	}
	
	public Usuario pesquisarUsuario(Usuario user){
		/**
		 * O objetivo é procurar no banco de dados se o Usuario está contido ou nao
		 * Esse metodo vai servir para cadastrar e remover usuario
		 */
		return user;
		
	}

}
