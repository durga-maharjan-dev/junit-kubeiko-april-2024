package junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAddition {


	Addition addition = null;

	@Before
	public void beforeEveryTestCase(){
		System.out.println("...before every test case started...");
		addition = new Addition();
	}


	@Test 
	public void testAddWhenBothNumbersArePositive(){
		int result = addition.add(10,10);
		assertEquals(20, result);

	}

	@Test 
	public void testAddWhenBothNumbersAreNegative(){

		int result = addition.add(-10,-10);
		assertEquals(-20, result);

	}

	@Test 
	public void testAddWhenANumberIsNegative(){

		int result = addition.add(10,-10);
		assertEquals(0, result);

	}


	@After
	public void afterEveryTestCase(){
		System.out.println("...after every test case completed...");
	}


}

