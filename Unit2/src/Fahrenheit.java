//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double fahrenheit;

	public double setFahrenheit(double fahren)
	{
		return fahren;
	}

	public double getCelsius(double fahren)
	{
		double celsius = 0.0;
		double step1 = fahren - 32;
		double step2 = step1*5;
		celsius = step2/9;
		
		System.out.println(fahren + " degrees Fahrenheit == " + celsius + " degrees Celsius \n");
		return celsius;
	}

	public void print()
	{

	}
}