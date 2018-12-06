package dev;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.runners.Parameterized.*;
import java.util.*;

@RunWith(Parameterized.class)
public class RocketTest {
	//	Instance Variables
	int length, width, weight;
	String destination;
	
	//	Constructors
	public RocketTest() {
		this.length=5;
		this.width=4;
		this.weight=10;
	}
	
	@Parameters
	public static Collection<Object[]> data(){
		//	Length=5, Width=4, Weight=10
		Object[][] data = new Object[][] {{5,5}, {4,4}, {10,10}};
		return Arrays.asList(data);
	}
	
	@Parameter(0)
	public int expectedObj;
	
	@Parameter(1)
	public int inputObj;
	
	@Test
	public void constructorTest() {
		assertEquals(expectedObj, inputObj);
	}

}
