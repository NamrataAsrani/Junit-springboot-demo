package hellojunit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class CalculatorTest {

	@Parameters
	public static Collection<Integer[]> data(){
		return Arrays.asList(new Integer[][] {
				{0,0,0}, {1,1,2},{1,3,4}
		});
	}
	
	private  Calculator calculator;
	private  int a;
	private  int b;
	private  int expectedsum;
	
	public CalculatorTest( int a, int b, int expectedsum) {
		super();
		this.a = a;
		this.b = b;
		this.expectedsum = expectedsum;
	}
	
	@Before
	public void setup() {
		calculator=new Calculator();
	}
	

	@Test
	public void shouldreturnsum() {
		
		assertEquals(expectedsum,calculator.Sum(a, b));
	}
	
	

}
