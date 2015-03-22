package controllers;

/**
 * Created by paulo_000 on 20/03/2015.
 */

public class Integrador{



    /**
     * Metodo que sera usado, para permitir que usuario concorde/discorde
     * ou apenas deixar a dica visivel.
     */

    public boolean dicaApenasVisivel(Dica dica){
        if(dica.getConcordar() + dica.getDiscordar() == 20){
            return true;
        }

        return false;
    }


    public void denunciarDica(Dica dica, String string){
        dica.adicionaDenuncia(string);
        if(dica.getDenuncias().size() == 3){
            // dica deve ser excluida;
        }

    }

    public void adicionarDica(){}

    public void cadastrarUsuario(){}



    public void pesquisarUsuario(){}







}
