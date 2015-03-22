import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

import controllers.Dica;
import controllers.DicaConselho;
import controllers.Usuario;


public class DicaTest extends TestCase {
	
	private Dica dica;
	private Usuario usuario;
	
	protected void setUp() throws Exception {
		super.setUp();
		
		usuario = new Usuario("paulo", "paulocob", "123");
		dica = new DicaConselho(usuario, "conselho"); 
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
