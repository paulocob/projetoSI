package controllers;

import java.util.ArrayList;
import java.util.List;

public abstract class Tema {
	private List<Dica> dicas = new ArrayList<Dica>();

    private int discordar;
    private int concordar;
    private int dificuldade;

    public int getDificuldade() {
        return dificuldade;
    }

    /**
     * Dificuldade possui valor entre -2 e +2
     * @param dificuldade
     */
    public void setDificuldade(int dificuldade) {
        if(dificuldade >= -2 || dificuldade <= 2){
            this.dificuldade = dificuldade;
        }else{
            //adicionar excecao
        }

    }

    public int indiceConcordancia(){
        return concordar/(discordar+concordar);
    }

    public int getDiscordar() {
        return discordar;
    }

    public void setDiscordar() {
        this.discordar = discordar++;
    }

    public int getConcordar() {
        return concordar;
    }

    public void setConcordar() {
        this.concordar = concordar++;
    }
}
