package programs;

public class swapstrings {

	public static void main(String[] args) {

		// swap 2 strings
		
		String s1 = "india";
		
		String s2 = "Asia";
		
	    //String temp = s1; // assign s1 value to temp
		
		//s1 = s2; // assign s2 value to s1
		
		//s2 = temp; // assigning temp value to s2
		
		// withput using temp variable
		
		s1 = s1 + s2;
		// first do for s2 then for s1
		
		s2 = s1.substring(0,s1.length()-s2.length());
		
		s1 = s1.substring(s2.length());
		
		
		
		
		System.out.println("after swap s1 "+s1+" s2 is "+s2);
		
		
		//s2 = 
		
		//System.out.println(s3);
		
	}

}
