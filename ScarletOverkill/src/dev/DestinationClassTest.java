package dev;

import static org.junit.Assert.*;

import org.junit.Test;


public class DestinationClassTest {

	@Test
	public void testSetNumPlanes() {
		//fail("Not yet implemented");
		//Create new DestinationClass object called test
		DestinationClass test = new DestinationClass();
		//set number of planes to 2
		test.setNumPlanes(2);
		//check that the number of planes does equal 2
		assertTrue(test.getNumPlanes() == 2);
	}

	@Test
	public void testGetNumPlanes() {
		//fail("Not yet implemented");
		//Create new DestinationClass object called test
		DestinationClass test = new DestinationClass();
		//set number of planes to 3
		test.setNumPlanes(3);
		//check that the number of planes does equal 3
		assertTrue(test.getNumPlanes() == 3);
		
	}

	@Test
	//leave this test blank to show example failure message
	public void testAtCapacity() {
		fail("Not yet implemented");
	}

}
