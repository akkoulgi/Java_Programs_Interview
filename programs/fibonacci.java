package programs;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 0 , 1 , 1 , 2, 3 , 5 , 8 
		
		Scanner s  = new Scanner(System.in);
		
		System.out.println("Enter the length of string");
		
		int[] arr = new int[s.nextInt()];
		
		arr[0] = 0;
		
		arr[1] = 1;
		
		
		for (int i = 2; i < arr.length; i++) {
	
			arr[i] = arr[i-1] + arr[i-2];
			
		}

		
		// print the array
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}
		
	}

}
