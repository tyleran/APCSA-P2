
public class LabAssessment {
	
	 static int num[];
	
	
	public static boolean isGoofy(int number) {
		
		for (int i = 0; i < number.length(); i++) {
			int digitdivisor = 0;
			int sum = 0;
			if (number%number.indexof(i) == 0){
				digitdivisor = number.indexof(i);
				sum += digitdivisor;
				if (sum%2 != 0 && sum>=0)
				num = num + number +"";
				return true;
			}
			else {
				return false;
			}
		}
			
	}
	
	public static int[] getSomeGoofyNumbers(int count){
		int[] array = num;
		for (int i=0; i<=count; i++){
			if (isGoofy(i)== true)
				array = array[]+array[i];
				
		}
		return array;
	}
	
	
	public static void main(String args[]) {
		isGoofy(12);
			
	}
	
}
