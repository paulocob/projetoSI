package controllers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by paulo_000 on 20/03/2015.
 */

@Entity
public class DicaConselho extends Dica {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

    private String conselho;
    private Usuario usuario;

    public DicaConselho(){}

    public DicaConselho(Usuario usuario,String conselho){
    	this.usuario = usuario;
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