//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		Scanner r = new Scanner(System.in);
		System.out.print("Enter a radius: ");
		double radius = r.nextDouble();
	}

	public void calculateArea( )
	{
		double area = radius*radius*3.14;
		
	}

	public void print( )
	{
		System.out.println("The area is : " + area + "\n");
	}
}