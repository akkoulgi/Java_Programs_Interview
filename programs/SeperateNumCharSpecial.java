package programs;

public class SeperateNumCharSpecial {

	public static void main(String[] args) {
		
		String s = "123sadsaf@!@#32432safd";
		
		String alpha = "";
		
		String num = "";
		
		String special = "";
		
		
		for (int i = 0; i < s.length(); i++) {
			
			if(Character.isAlphabetic(s.charAt(i))) {
				
				
				alpha= alpha+s.charAt(i);
			}
			else if(Character.isDigit(s.charAt(i)))
			{
				
				num = num+s.charAt(i);
				
				
			}else 
				
				special = special + s.charAt(i);
			
		}
		
		
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(special);
		

	}

}
