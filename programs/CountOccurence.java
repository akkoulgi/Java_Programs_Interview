package programs;

import java.util.HashMap;

public class CountOccurence {
	
    public static void main(String[] args) {

    	
    	String a = "bbddodcaaannnaaannnbbbiiibbb";
    	
    	
    	HashMap< Character, Integer> map = new HashMap<Character,Integer>();
    	
    	
    	for (int i = 0; i < a.length(); i++) {
			
    		
    		// first we will check whether a character is already preset in the hashmap
    		if(map.containsKey(a.charAt(i))) {
    			
    			map.put(a.charAt(i), map.get(a.charAt(i))+1);
    			
    		}
    		else
    			
    	map.put(a.charAt(i), 1);	
    		
    		
		}
    		
    	
    	
    	
    	
    	System.out.println(map);
    	

	}

}

