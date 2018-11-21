package dev;

public class Plane{
	
	int length, width, weight;
	String destination;
	
	public Plane (int lengthIn, int widthIn, int weightIn)
	{
		this.length = lengthIn;
		this.width = widthIn;
		this.weight = weightIn;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getWeight()
	{
		return weight;
	}
	
	public void destination(String destinationIn)
	{
		this.destination = destinationIn;
	}
	
}

