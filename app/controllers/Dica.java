package controllers;


/**
 * Created by paulo_cesar on 20/03/2015.
 */
import java.util.ArrayList;

public class Dica {

    private String nomeAssunto;
    private String preRequisito;
    private String conselho;
    private ArrayList<String> material = new ArrayList<String>();

    public String getNomeAssunto() {
        return nomeAssunto;
    }

    public void setNomeAssunto(String nomeAssunto) {
        this.nomeAssunto = nomeAssunto;
    }

    public String getConselho() {
        return conselho;
    }

    public void setConselho(String conselho) {
        this.conselho = conselho;
    }

    public ArrayList<String> getMaterial() {
        return material;
    }

    public void setMaterial(String link) {
        material.add(link);
    }
}
