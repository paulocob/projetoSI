
import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controllers.DicaConselho;
import controllers.Tema;
import controllers.Usuario;


public class TemaTest extends TestCase{
	
	private Tema tema;
	private DicaConselho dica;
	private Usuario user;
	

	@Before
	public void setUp() throws Exception {
		user = new Usuario("paulo", "paulocob", "00");
		tema = new Tema("nome");
		dica = new DicaConselho(user, "conselho");
		
		
	}

	@Test
	public void test() {
		Assert.assertEquals("nome", tema.getNome());
		
		tema.adicionarDica(dica);
		Assert.assertTrue(tema.getDicas().contains(dica));
		
		tema.removeDica(dica);
		Assert.assertFalse(tema.getDicas().contains(dica));
		
		tema.adicionaDificuldade(0);
		Assert.assertEquals(0, tema.mediaDificuldade());
		
		tema.adicionaDificuldade(2);
		Assert.assertEquals(1, tema.mediaDificuldade());
		
		
		
		

		
		
	}

}
