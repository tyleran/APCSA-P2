//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Lab02f
{
	public static void main( String[] args )
   {
		//add test cases
		Line test = new Line(1, 2, 3, 4);
		test.setCoordinates(1,9,14,2);
		test.setCoordinates(1, 7, 18, 3);
		test.setCoordinates(6,4,2,2);
		test.setCoordinates(4, 4, 5, 3);
		test.setCoordinates(1, 1, 2, 9);
		System.out.print("\n");
		test.calculateSlope(1,9,14,2);
		test.calculateSlope(1, 7, 18, 3);
		test.calculateSlope(6,4,2,2);
		test.calculateSlope(4, 4, 5, 3);
		test.calculateSlope(1, 1, 2, 9);


		
		
	}
}