
import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Test;




import controllers.DicaConselho;
import controllers.DicaMaterial;
import controllers.DicaPreRequisito;
import controllers.Usuario;


public class DicaTest extends TestCase {
	
	private DicaConselho dica;
	private DicaMaterial dica1;
	private DicaPreRequisito dica2, dica3;
	private Usuario usuario;
	
	protected void setUp() throws Exception {
		super.setUp();
		
		usuario = new Usuario("paulo", "paulocob", "123");
		dica = new DicaConselho(usuario, "conselho"); 
		
		dica1 = new DicaMaterial(usuario, "link");
		
		dica2 = new DicaPreRequisito();
		dica3 = new DicaPreRequisito(usuario,"GI", "razao");
	}
	

	@Test
	public void test() {
		
		/**
		 * Testes referentes a DicaConselho
		 */
		dica.setNomeAssunto("nome");
		Assert.assertEquals("nome", dica.getNomeAssunto());
		
		dica.adicionaDenuncia(usuario);
		Assert.assertEquals(1, dica.getDenuncias().size());
		
		dica.setConcordar();
		Assert.assertEquals(1, dica.getConcordar());
		
		dica.setDiscordar();
		Assert.assertEquals(1, dica.getDiscordar());
		
		Assert.assertEquals("conselho", dica.getConselho());
		dica.setConselho("qualquer");
		Assert.assertEquals("qualquer", dica.getConselho());
		
		/**
		 * Testes referentes a DicaMaterial
		 */
		
		dica1.setNomeAssunto("nome");
		Assert.assertEquals("nome", dica1.getNomeAssunto());
		
		dica1.adicionaDenuncia(usuario);
		Assert.assertEquals(1, dica1.getDenuncias().size());
		
		dica1.setConcordar();
		Assert.assertEquals(1, dica1.getConcordar());
		
		dica1.setDiscordar();
		Assert.assertEquals(1, dica1.getDiscordar());
		
		Assert.assertEquals("link", dica1.getUrlMaterial());
		dica1.setUrlMaterial("novolink");
		Assert.assertEquals("novolink", dica1.getUrlMaterial());
		
		/**
		 * Testes referentes a DicaPreRequisito
		 */
		
		Assert.assertEquals(null, dica2.getNomeAssunto());
		Assert.assertEquals(null, dica2.getNomeDisciplina());
		Assert.assertEquals(null, dica2.getRazao());
		Assert.assertEquals(0, dica2.getDenuncias().size());
		Assert.assertEquals(0, dica2.getConcordar());
		Assert.assertEquals(0, dica2.getDiscordar());
		
		dica2.setNomeAssunto("nome");
		dica2.setConcordar();
		dica2.setDiscordar();
		dica2.setNomeDisciplina("GI");
		dica2.setRazao("razao");
		
		Assert.assertEquals("nome", dica2.getNomeAssunto());
		Assert.assertEquals("GI", dica2.getNomeDisciplina());
		Assert.assertEquals(1, dica2.getConcordar());
		Assert.assertEquals(1, dica2.getDiscordar());
		
		Assert.assertEquals("GI", dica3.getNomeDisciplina());
		Assert.assertEquals("razao", dica3.getRazao());
		
		
		
		
		
	}

}
