package controllers;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.*;

@Entity
public class Dica {
	
	/**
	 * int tipo
	 * tipo = 1, o que voce precisa saber para nao ter dificuldades (nome de um assunto)
	 * tipo = 2, disciplinas anteriores que te ajudarão aqui (com nome e razão)
	 * tipo = 3, material util (com URL começando com http:// e acabando com .com, .com.br, .edu ou .edu.br)
	 * tipo = 4, conselho (com texto, apenas)
	 */
	
	@Id
	@GeneratedValue
	private Integer id;
	private Integer tipo;
	private String conteudo;
	private Integer votospositivos;
	private Integer votosnegativos;
	private Integer concordancia = votospositivos - votosnegativos;
	private List<String> comentarios = new ArrayList<String>();
	
	private void adicionarVoto(Integer voto) {
		if (voto==1) votospositivos += 1;
		else {
			votosnegativos += 1;
			adicionaCritica();
		}
	}

	/**
	 * @return the tipo
	 */
	public Integer getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the conteudo
	 */
	public String getConteudo() {
		return conteudo;
	}

	/**
	 * @param conteudo the conteudo to set
	 */
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	/**
	 * @return the votospositivos
	 */
	public Integer getVotospositivos() {
		return votospositivos;
	}

	/**
	 * @return the votosnegativos
	 */
	public Integer getVotosnegativos() {
		return votosnegativos;
	}

	/**
	 * @return the concordancia
	 */
	public Integer getConcordancia() {
		return concordancia;
	}

	/**
	 * @return the comentarios
	 */
	public List<String> getComentarios() {
		return comentarios;
	}

	private void adicionaCritica() {
		// TODO Auto-generated method stub
		
	}
	
}
