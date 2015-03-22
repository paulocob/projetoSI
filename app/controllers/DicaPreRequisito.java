package controllers;

/**
 * Created by paulo_000 on 20/03/2015.
 */
public class DicaPreRequisito extends Dica{


    private String nomeDisciplina;
    private String razao;
    private Usuario usuario;

    public DicaPreRequisito(){}

    public DicaPreRequisito(Usuario usuario, String nome,String razao){
    	this.usuario = usuario;
        this.nomeDisciplina = nome;
        this.razao = razao;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    @Override
    public String exibir() {
        String label = "<span class=\"label label-info\">" + "Disciplinas anteriores que te poderão te ajudar" + "</span>";
        String textDisciplina = "<h5>" + "Disciplina: " + nomeDisciplina + "</h5>";
        String textRazao = "<h5>" + razao + "</h5>";
        return  textDisciplina  + textRazao + label + "<br>";
    }
}
