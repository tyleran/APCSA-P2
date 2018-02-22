//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class Triples
{
   private int number;
   private int A;
   private int B;
   private int C;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private boolean greatestCommonFactor(int a, int b, int c)
	{
		A = a;
		B = b;
		C = c;
		for (int i = 2; i < c; i++){
			if (a % i == 0 && b % i == 0 && c % i == 0){
				return true;
			}
		}
		return false;
	}

	public String toString()
	{
		String output = "";
		for (A = 1; A < number; A++){
			for (B = A; B < number; B++){
				for (C = B; C < number; C++){
					if (greatestCommonFactor(A, B, C) != true)
					{
						if ((Math.pow(A, 2) + Math.pow(B, 2)) == Math.pow(C, 2)){
							if ((A % 2 == 0 && B % 2 == 1) || (A % 2 == 1 && B % 2 ==0)){
								output = output + A + " " + B + " " + C + "\n";
							}
						}
					}
				}
			}
		}
		return output + "\n";
	}
}