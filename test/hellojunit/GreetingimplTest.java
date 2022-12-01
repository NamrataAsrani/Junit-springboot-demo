package hellojunit;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingimplTest {

	private Greeting greeting;
	@Before
	public void setup() {
		greeting =new Greetingimpl();
	}
	@Test
	public void nameshouldreturnvalidoutput() {
		
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit",result);
	}
	
	@Test
	public void namecontains() {
		String result =greeting.greet("junit");
		assertFalse(result.isEmpty());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetshouldthrowexcptionif_name_is_null() {
		
		greeting.greet(null);
		}
	
	@Test(expected=IllegalArgumentException.class)
	public void greetshouldthrowexcptionif_name_is_blank() {

			greeting.greet("");
	}
	
	
	@After
	public void tearDown(){
		greeting =null;
	}

	
	

}
