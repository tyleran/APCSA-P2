//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name;

	public Name()
	{


	}

	public Name(String s)
	{
		name = s;
	}

   public void setName(String s)
   {
	   name = s;

   }

	public String getFirst()
	{
		
		return name.substring(0,5);
	}

	public String getLast()
	{
		return name.substring(6,16);
	}

 	public String toString()
 	{
 		return name + "\n";
	}
}