package dev;

public class DestinationClass {

	private int destinationID;
	private int numDestinations;
	private int numPlanes;
	private int numSpaceShips;
	private boolean capacity;

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
		if(numSpaceShipsIn > 0)
		{
			return "Destination can only hold planes or spaceships, not both";
		}
		else if(numPlanesIn > 3)
		{
			return "The number of planes cannot be more than 3";
		}
		else
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
		if(numPlanes > 0)
		{
			return "Destination can only hold planes or spaceships, not both";
		}
		else if(numSpaceShipsIn > 2)
		{
			return "The number of spaceships cannot be more than 3";
		}
		else
		{
			this.numSpaceShips = numSpaceShipsIn ;
		}
	}
	
	public int getNumSpaceShips()
	{
		return this.numSpaceShips;
	}

	public boolean atCapacity()
	{
		capacity = false;
		if(numPlanes > 3 || numSpaceShips > 2)
		{
			capacity = true;
		}
	}
	
	public String ToString()
	{
		return this.destinationID + " " + this.numDestinations + " " + this.numPlanes + " " + this.numSpaceShips;
	}
	
	
	
	
	
	
}
