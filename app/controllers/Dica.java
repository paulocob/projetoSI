package controllers;


/**
 * Created by paulo_cesar on 20/03/2015.
 */
import java.util.ArrayList;
import java.util.List;

public abstract class Dica {

    private String nomeAssunto;

    private int discordar;
    private int concordar;

    private List<String> denuncias = new ArrayList<String>();

    public List<String> getDenuncias() {
        return denuncias;
    }

    public String getNomeAssunto() {
        return nomeAssunto;
    }

    public void setNomeAssunto(String nomeAssunto) {
        this.nomeAssunto = nomeAssunto;
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

    public void adicionaDenuncia(String denuncia){
        denuncias.add(denuncia);
    }


    public abstract String exibir();
}
