//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;
import java.util.Scanner;
public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		size = count;
		letter = let;
	}

	public void setTriangle( String let, int sz )
	{
		size = sz;
		letter = let;
	}

	public String getLetter()
	{
		return "#";
		
	} 
		
		
	

	public String toString()
	{
		String output = "";
		 for (int i = size; i >= 0; i--){
				for(int d = 1; d<i; d++){ 
					output+=("       ");
				}
			for (int j = 1; j >= i; j--) {
				output += letter;
			}
		 }
		 return output;	
		 }
}



	

