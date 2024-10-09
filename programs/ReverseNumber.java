package programs;

public class ReverseNumber {

	public static void main(String[] args) {

		int n = 12345; 
		
		// logic 
		// first get the last digit by using % 10 
		
		// nad then just keep on appending it to a new number
		
		int rev = 0;
		
		while(n!=0) {
			
			int lastdigit = n % 10 ; // getting the last digit
			
			rev = rev*10+ lastdigit;
			
			n = n/10; // removes the last digit in java
		}
		
		
		
		System.out.println(rev);
	}

}
