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
	
	public void setNumPlanes(int numPlanesIn)
	{
		//Can only have planes/spaceships, not both
		//Number of planes cannot be more than 3
		if(numSpaceShips <= 0 && numPlanes < 3)
		{
			this.numPlanes = numPlanesIn ;	
		}
	}
	
	public int getNumPlanes()
	{
		return this.numPlanes;
	}
	
	public void setNumSpaceShips(int numSpaceShipsIn)
	{
		//Can only have planes/spaceships, not both
		//Number of spaceships cannot be more than 2
		if(numPlanes <= 0 && numSpaceShips < 2)
		{
			this.numSpaceShips = numSpaceShipsIn ;
		}
	}
	
	public int getNumSpaceShips()
	{
		return this.numSpaceShips;
	}

	//Can only have 3 planes and 2 spaceships at a time
	public boolean atCapacity()
	{
		boolean capacity = false;
		if(numPlanes > 3 || numSpaceShips > 2)
		{
			capacity = true;	
		}
		return capacity;
	}
	
	public String ToString()
	{
		return this.destinationID + " " + this.numDestinations + " " + this.numPlanes + " " + this.numSpaceShips;
	}
	
	
	
	
	
	
}
