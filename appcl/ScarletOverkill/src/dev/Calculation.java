package dev;

public class Calculation {
	private int noOfMinions;
	private int noOfLasers;
	final private double COST_OF_MINION = 50.00;
	final private double COST_OF_LASER = 40.00;
	
	public Calculation(int minionNum, int laserNum)
	{
		noOfMinions = minionNum;
		noOfLasers = laserNum;
		
	}
	
	
	public double getCost()
	{
		//returns cost depending on number of minions and lasers
		double cost;
		cost = noOfMinions * COST_OF_MINION;
		cost += noOfLasers * COST_OF_LASER;
		return cost;
	}
}
