package programs;

public class ReverseArray {

	public static void main(String[] args) {

		
		int[] arr = {1,2,3,4,5,6};

		
			// Logic - run a loop - inside that  first swap first and last elements
		int temp;

		int n = arr.length;
		int i =0;
		while(i<n) {
			temp= arr[i];
			arr[i]=arr[n-1];
			arr[n-1]=temp;
			
			
			
			i++;
			n--;
			
		}
			
		
		for (int j = 0; j < arr.length; j++) {
			
			System.out.println(arr[j]);
		}
		
	}

}
