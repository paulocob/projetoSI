
import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controllers.Disciplina;
import controllers.Tema;


public class DisciplinaTest extends TestCase {

	private Disciplina disc;
	private Tema tema;
	
	@Before
	public void setUp() throws Exception {
		disc = new Disciplina("GI");
		tema = new Tema("nome");
		}

	@Test
	public void test() {
		disc.addTema(tema);
		
		Assert.assertEquals("GI", disc.getNome());
		Assert.assertTrue(disc.getTemas().contains(tema));
		
		disc.setNome("qualquer");
		Assert.assertEquals("qualquer", disc.getNome());
		
	}

}
