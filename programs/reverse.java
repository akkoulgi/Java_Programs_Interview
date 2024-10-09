package programs;

import java.util.Scanner;

public class reverse {

	
	// Program to reverse a string
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		
		System.out.println("ENter a name to reverse ");
		String name = s1.next();

		//String s = "gadag";
		String rev="";
		
		for (int i = name.length()-1; i >= 0; i--) {
			
			rev = rev + name.charAt(i);
			
			
		}
		
		System.out.println(rev);
		
		if(rev.equals(name)) {
			
			System.out.println("String is a palindrome");
		}
		else
			System.out.println("String is not a palindrome");
		
	}

}
