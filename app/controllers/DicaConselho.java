package controllers;

/**
 * Created by paulo_000 on 20/03/2015.
 */
public class DicaConselho extends Dica {

    private String conselho;

    public DicaConselho(){}

    public DicaConselho(String conselho){
        this.conselho = conselho;
    }

    public String getConselho() {
        return conselho;
    }

    public void setConselho(String conselho) {
        this.conselho = conselho;
    }


    @Override
    public String exibir() {
        String label = "<span class=\"label label-info\">" + "Conselho" + "</span>";
        String textConselho = "<h5>" + conselho + "</h5>";
        return textConselho + label + "<br>";
    }
}