package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
public class Disciplina {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	@ElementCollection
	private List<Tema> temas = new ArrayList<Tema>();
	private String nome;
	
	
	public Disciplina(String nome){
		this.nome = nome;
	}
	
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
	
	public void addTema(Tema tema){
		temas.add(tema);
	}
}
