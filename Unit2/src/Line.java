//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public Line(int x1, int y1, int x2, int y2)
	{		



	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		System.out.print("x1 = " + x1 + " ");
		System.out.print("x2 = " + x2 + " ");
		System.out.print("y1 = " + y1+ " ");
		System.out.print("y2 = " + y2+ " \n");
		
	}

	public void calculateSlope(int x1, int y1, int x2, int y2)
	{
		double y = y2 - y1;
		double x = x2 - x1;
		double slope = y/x;
		System.out.println("The slope is " + slope);



	}

}