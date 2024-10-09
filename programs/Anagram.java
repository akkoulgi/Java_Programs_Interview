package programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "sadsa";
		
		String s2 = "dasas";
		
		
		
		
		if(s1.length()!=s2.length()) {

			System.out.println("Not an anagram");
		}
		
		else {
			char[] as1 = s1.toCharArray();
			
			 char[] as2 = s2.toCharArray();
			 
			 Arrays.sort(as1);
			 Arrays.sort(as2);
			

			if(Arrays.equals(as1, as2)) {
				
				System.out.println("2 strings are anagram");
			}else
				
				System.out.println("Not an anagram");
			
			
		}
		
		

	}

}
