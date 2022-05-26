import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 1234;
		int b = 8765;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 9999;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testSubtract() {
		int a = 9876;
		int b = 4321;
			
		Calculator cal = new Calculator ();
		int actual = cal.subtract(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}

	@Test
	public void testMultiple() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator ();
		int actual = cal.multiple(a, b); 
			 
		int expected = 5332114;
		assertEquals (expected, actual);
		}

	@Test
	public void testDivideWithDenominator() {
		int a = 4936;
		int b = 1234;
			
		Calculator cal = new Calculator ();
		int actual = cal.divide(a, b); 
			 
		int expected = 4;
		assertEquals (expected, actual);
		}
	
	@Test
	public void testDivideWithoutDenominator() {
		int a = 4936;
		int b = 0;
	
	try {	
		Calculator cal = new Calculator ();
		cal.divide(a, b); 
		fail("Excepted an IllegalArgumentException to be thrown");
			}catch (IllegalArgumentException e) {
				assertEquals("Cannot be divided by 0!", e.getMessage());
			}catch (Throwable t) {
				assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}
	
	@Test
	public void testPower() {
		int a = 2;
		int b = 2;
	
		Calculator cal = new Calculator ();
		int actual = (int) cal.power(a, b); 
		 
		int expected = 4;
		assertEquals (expected, actual);
		}

	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
