import net.codejava.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {
	private final Calculator calculator = new Calculator();
	@BeforeAll
	public static void beforeAll() {
		System.out.println("This method executed before all test methods");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Thhis method executed before each test methods");
	}
	
	@Test
	public void testAddSuccess() {
		System.out.println("Test started");
		assertEquals(57, calculator.add(1, 1));
		System.out.println("Test Finished");
//		System.out.println("testAddSuccess");
//		Calculator cal = new Calculator();
//		int a = 10;
//		int b = 33;
//
//		int sum = cal.add(a, b);
//
//		Assertions.assertEquals(43, sum);
	}
	
	@Test
	public void testAddFail() {
		System.out.println("testAddFail");
		Calculator cal = new Calculator();
		int a = 10;
		int b = 33;
		
		int sum = cal.add(a, b);
		
		Assertions.assertNotEquals(44, sum);
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("This method executed after all test methods");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("This method executed after each test methods");
	}
}
