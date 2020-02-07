package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		mph = distance/(hours+(minutes/60));
				
	}

	public void print()
	{
System.out.println( distance + " Miles travelled in " + hours + " hours +" +minutes+ " minutes = " + mph + "mph");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return " Miles travelled in" + distance + " hours +" +hours+ " minutes = " + minutes + " mph : " + mph;
	}
}