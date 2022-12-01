package hellojunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Greetingtest {
	private Greeting greeting;
	
	@Before
	public void setup() {
		System.out.println("Before");
		greeting = new Greetingimpl();
		
	}

	@Test
	public void nameshouldbevalid() {
		System.out.println("name should be valid");
		String result=greeting.greet("Junit");
		
		assertNotNull(result);
		assertEquals("Hello Junit",result);
		
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void ifnameisnull() {
		System.out.println("name is null");

		greeting.greet(null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void ifnameisblank() {
		System.out.println("name is blank");

		greeting.greet("");
	}
	
	@After
	public void teardown() {
		System.out.println("after");

		greeting=null;
	}

}
