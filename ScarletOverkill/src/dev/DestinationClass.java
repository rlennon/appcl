package dev;

public class DestinationClass {

	private int destinationID;
	private int numDestinations;
	private int numPlanes;
	private int numSpaceShips;
	
	public DestinationClass(int destinationIDIn, int numDestinationsIn, int numPlanesIn, int numSpaceShipsIn)
	{
		destinationID = destinationIDIn;
		numDestinations = numDestinationsIn;
		numPlanes = numPlanesIn;
		numSpaceShips = numSpaceShipsIn;
	}
	
	public int getDestinationID()
	{
		return this.destinationID;
	}
	
	public int getNumDestination() 
	{
		return this.numDestinations;
	}
	
	public void setNumPlanes()
	{
		this.numPlanes = 3 ;
	}
	
	public int getNumPlanes()
	{
		return this.numPlanes;
	}
	
	public void setNumSpaceShips()
	{
		this.numSpaceShips = 2 ;
	}
	
	public int getNumSpaceShips()
	{
		return this.numSpaceShips;
	}
	
	public String ToString()
	{
		return this.destinationID + " " + this.numDestinations + " " + this.numPlanes + " " + this.numSpaceShips;
	}
	
	
	
	
	
	
}
