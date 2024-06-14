package junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFactorial {

	Factorial factorial = null;
	
	@Before
	public void beforeEachTest() {
		factorial = new Factorial();
	}

	@Test 
	public void testFactorialWhenNumberIsOne(){
		int result = factorial.factorial(1);
		assertEquals(1,result);
	}

	@Test 
	public void testFactorialWhenNumberIsZero(){
		int result = factorial.factorial(0);
		assertEquals(1,result);
	}

	@Test 
	public void testFactorialWhenNumberIsFive(){
		int result = factorial.factorial(5);
		assertEquals(120,result);
	}

	@Test(expected= ArithmeticException.class)
	public void testFactorialWhenNumberIsNegative(){
		factorial.factorial(-5);
	}
	
	@After
	public void afterEachTest() {
		System.out.println("test is done successfully.");
	}

}
