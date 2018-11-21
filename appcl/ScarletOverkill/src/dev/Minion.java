package dev;
 public class Minion {
	
	private String height;
	private String width;
	
 	//only 2 types of minion can be created ---- tall + skinny or small + fat
	
	//only one field needs to checked 
	public Minion(String heightIn) //only one field is needed in constructor 
	{
		if(heightIn=="tall") //if height provided by the user is tall create a 
		{					 //minion that is tall and skinny
			height = "tall";
			width = "skinny";
		}
		else if(heightIn=="small") //if height provided by the user is small create a 
		{						   //minion that is small and fat
			height = "small";
			width = "fat";
		}
		
	}
	
	
	//retrieves height
	public String getHeight() 
	{
		return height;
	}
	
	
	//retrieves width
	public String getWidth()  
	{
		return width;
	}
 }