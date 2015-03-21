package controllers;

/**
 * Created by paulo_000 on 20/03/2015.
 */
public class DicaMaterial extends Dica{

    private String urlMaterial;

    public DicaMaterial(){}

    public DicaMaterial(String url){
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
