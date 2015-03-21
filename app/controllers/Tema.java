package controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tema implements Comparator{
	private List<Dica> dicas = new ArrayList<Dica>();

    private String nome;
    private float media;
    private float mediana;

    private List<Integer> dificuldade = new ArrayList<Integer>();

    public Tema(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private void adicionarDica(Dica dica){
        dicas.add(dica);
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


    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
