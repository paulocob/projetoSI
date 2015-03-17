package controllers;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private List<Tema> temas = new ArrayList<Tema>();
	private String nome;
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the temas
	 */
	public List<Tema> getTemas() {
		return temas;
	}
}
