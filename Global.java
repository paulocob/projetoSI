import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import controllers.DicaConselho;
import controllers.DicaPreRequisito;
import controllers.DicaMaterial;
import controllers.Dica;
import controllers.Disciplina;

import models.GenericDAO;
import models.GenericDAOImpl;
import controllers.Tema;
import controllers.Usuario;
import play.*;
import play.Application;
import play.GlobalSettings;
import play.Logger;
import play.db.jpa.JPA;


public class Global extends GlobalSettings{
		
		private GenericDAO dao = new GenericDAOImpl();
		private List<Tema> temas = new LinkedList<Tema>();
		private List<Usuario> usuarios = new LinkedList<Usuario>();
		
		public void addTemaGlobal(Disciplina disciplina, String nome) {
			if (dao.findByAttributeName("Tema", "nome", nome) != null) {
				Tema tema = new Tema(nome);
				
				Dica dica = new DicaMaterial();
				dica.setUrlMaterial("dicaUrl");
				dao.persist(dica);
				tema.adicionarDica(dica);
				
				dica = new DicaPreRequisito();
				dica.setNomeDisciplina("GI");
				dica.setRazao("razao");
				dao.persist(dica);
				tema.adicionarDica(dica);
				
				dica = new DicaConselho();
				dica.setConselho("conselho1");
				dao.persist(dica);
				tema.adicionarDica(dica);
				
				dao.persist(tema);
				disciplina.addTema(tema);
			}
		}
		
		
		public void onStart(Application app){
			Logger.info("Aplicação inicializada...");

			JPA.withTransaction(new play.libs.F.Callback0() {
				@Override
				public void invoke() throws Throwable {
					Usuario usuario = new Usuario("Paulo", "paulocob", "123123");
					if (dao.findByAttributeName("Usuario", "login", "123123") != null) {
						dao.persist(usuario);
					}
					
					Disciplina disciplina = new Disciplina("SI1");
					
					addTemaGlobal(disciplina, "Análise x Design");
					addTemaGlobal(disciplina, "OO");
					addTemaGlobal(disciplina, "GRASP");
					addTemaGlobal(disciplina, "GoF");
					addTemaGlobal(disciplina, "Arquitetura");
					addTemaGlobal(disciplina, "Play");
					addTemaGlobal(disciplina, "JS");
					addTemaGlobal(disciplina, "HTML+CSS+Bootstrap");
					addTemaGlobal(disciplina, "Heroku");
					addTemaGlobal(disciplina, "Labs");
					addTemaGlobal(disciplina, "Minitestes");
					addTemaGlobal(disciplina, "Projeto");
					
					if (dao.findByAttributeName("Disciplina", "nome", "SI1") != null) {
						dao.persist(disciplina);
					}
					dao.flush();				
				}
			});
			
		}
	
	
}
