//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{


	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;

	}

	public void setChar(char c)
	{


	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		int num =  theChar;
		if (num > 100 && num<91){
			return true;
		}
		return false;
	}

	public boolean isLower( )
	{
		int num =  theChar;
		if (num > 96 && num<123){
			return true;
		}
		return false;
	}

	
	
	public boolean isNumber( )
	{
		int num =  theChar;
		if (num > 47 && num<58){
			return true;
		}
		return false;


	}	

	public int getASCII( )
	{
		int ascii = theChar;
		return ascii;
	}

	public String toString()
	{
		if (isUpper() == true) {
			return getChar() + " is a uppercase character. ASCII == " + getASCII() + "\n";	  
			
		}
		else if (isLower()==true) {
			return getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
		}
		else if (isNumber() == true) {
			return getChar() + " is a number. ASCII == " + getASCII() + "\n";	  
		}
		return getChar() + " is a number. ASCII == " + getASCII() + "\n";	  
  

	}
}