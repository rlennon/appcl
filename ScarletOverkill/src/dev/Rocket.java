//Rocket Class
package dev;

public class Rocket {
	
	//Variables
	int length, width, weight;
	String destination;
	

	//rocket object
	public Rocket (int lengthIn, int widthIn, int weightIn)
	{
		this.length = lengthIn;
		this.width = widthIn;
		this.weight = weightIn;
	}
	
	//get and set
	public int getLength()
	{
		return length;
	}
	
	//get width
	public int getWidth()
	{	
		return width;
	}
	
	//get weight
	public int getWeight()
	{
		return weight;
	}
	
	//destination
	public void destination(String destinationIn)
	{
		this.destination = destinationIn;
	}
}

