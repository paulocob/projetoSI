import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import controllers.Usuario;


public class UsuarioTest extends TestCase{
	
	private Usuario user1, user2;
	

	@Before
	public void setUp() throws Exception {
		user1 = new Usuario();
		user2 = new Usuario("paulo", "paulocob", "123");
		
	
	}

	@Test
	public void test() {
		Assert.assertEquals("paulocob", user2.getLogin());
		Assert.assertEquals("123", user2.getSenha());
		
		Assert.assertEquals(null, user1.getLogin());
		Assert.assertEquals(null, user1.getSenha());
		
		user1.setLogin("paulocob");
		user1.setSenha("123");
		Assert.assertEquals("paulocob", user1.getLogin());
		Assert.assertEquals("123", user1.getSenha());
		
		user2.setLogin("paulo");
		user2.setSenha("000");
		
		Assert.assertEquals("paulo", user2.getLogin());
		Assert.assertEquals("000", user2.getSenha());
		
		
		}

}
