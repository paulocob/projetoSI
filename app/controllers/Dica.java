package controllers;


/**
 * Created by paulo_cesar on 20/03/2015.
 */
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Dica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	private Usuario usuario;

    private String nomeAssunto;

    private int discordar;
    private int concordar;
    @ElementCollection
    private List<Usuario> denuncias = new ArrayList<Usuario>();
    
    public Dica(){}
    
    public Dica(Usuario usuario){
    	this.usuario = usuario;
    }

    public List<Usuario> getDenuncias() {
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

    public void adicionaDenuncia(Usuario user){
    	if (!denuncias.contains(user)){
			denuncias.add(user);
		}
    }
    
    public abstract String exibir();

	public long getId() {
		return id;
	}
}
