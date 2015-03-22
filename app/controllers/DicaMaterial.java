package controllers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by paulo_000 on 20/03/2015.
 */

@Entity
public class DicaMaterial extends Dica{
	
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

    private String urlMaterial;
    private Usuario usuario;

    public DicaMaterial(){}

    public DicaMaterial(Usuario usuario, String url){
    	this.usuario = usuario;
        this.urlMaterial = url;
    }

    public String getUrlMaterial() {
        return urlMaterial;
    }

    public void setUrlMaterial(String urlMaterial) {
        this.urlMaterial = urlMaterial;
    }


   @Override
     public String exibir() {
        String label = "<span class=\"label label-info\">" + "Material Útil" + "</span>";
        String textUrl = "<h5>" + urlMaterial + "</h5>";
        return  textUrl +  label + "<br>";
    }
}
