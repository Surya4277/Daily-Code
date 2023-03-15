package Day10;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest 
{
	 @Test
	    public void testAdd() {
	        assertEquals(5, Calculator.add(2, 3));
	        assertEquals(10, Calculator.add(5, 5));
	    }

	    @Test
	    public void testSubtract() {
	        assertEquals(5, Calculator.subtract(10, 5));
	        assertEquals(-2, Calculator.subtract(5, 7));
	    }

	    @Test
	    public void testMultiply() {
	        assertEquals(15, Calculator.multiply(3, 5));
	        assertEquals(0, Calculator.multiply(10, 0));
	    }

	    @Test
	    public void testDivide() {
	        assertEquals(2.0, Calculator.divide(10.0, 5.0), 0.0);
	        assertEquals(2.5, Calculator.divide(5.0, 2.0), 0.0);
	        try {
	            Calculator.divide(10.0, 0.0);
	            fail("Expected IllegalArgumentException to be thrown");
	        } catch (IllegalArgumentException e) {
	            assertEquals("Cannot divide by zero", e.getMessage());
	        }
	    }
}
