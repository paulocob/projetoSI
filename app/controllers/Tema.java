package controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Tema implements Comparator{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	

	private String nome;
    private float media;
    private float mediana;
	
	@ElementCollection
	private List<Dica> dicas = new ArrayList<Dica>();
    
    @ElementCollection
    private List<Integer> dificuldade = new ArrayList<Integer>();

    public Tema(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarDica(Dica dica){
        dicas.add(dica);
    }

    public void removeDica(Dica dica){
    	dicas.remove(dica);
    }

    /**
     * Dificuldade possui valor entre -2 e +2
     * @param dif
     */
    public void adicionaDificuldade(int dif) {
        if(dif >= -2 || dif <= 2){
            dificuldade.add(dif);
        }

    }

    public float mediaDificuldade(){
        int resultado = 0;
        for (int i = 0; i <= dificuldade.size(); i++){
            resultado += dificuldade.get(i);
        }

        return resultado;
    }

    public float medianaDificuldade(){
        float mediana;
        Collections.sort(dificuldade);
        if(dificuldade.size()%2 == 0){
            mediana = dificuldade.get(dificuldade.size()/2) + dificuldade.get((dificuldade.size()+1)/2);
        }else{
            mediana = dificuldade.get(dificuldade.size()/2);
        }

        return mediana/2;
    }

    public long getId() {
		return id;
	}

	public List<Dica> getDicas() {
		return dicas;
	}

	public List<Integer> getDificuldade() {
		return dificuldade;
	}

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
