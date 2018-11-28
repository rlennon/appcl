package dev;
import org.junit.Test;
import static org.junit.Assert.*;

public class RocketTest {
	
	int length, width, weight;
	String destination;

	@Test
	public void testRocket() {
		int lengthIn = 5, widthIn = 3, weightIn = 10;
		
			this.length = lengthIn;
			this.width = widthIn;
			this.weight = weightIn;
			
			assertEquals(length, lengthIn);
			assertEquals(width, widthIn);
			assertEquals(weight, weightIn);
	}

}
