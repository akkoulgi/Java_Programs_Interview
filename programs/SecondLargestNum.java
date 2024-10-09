package programs;

public class SecondLargestNum {

	public static void main(String[] args) {

		int arr[] = {1,100,2,4,3,99};
		
		int n = arr.length;
		
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				// compare the forst element with the next element in a loop
				// if the element is greater then the adjacent -> Swap using temp variable
				
				int temp;
				if(arr[i]>arr[j]) {
					
					temp = arr[i]; // storing arr[i] in temp

					 arr[i] =arr[j]; // storing the i+1 ele into i
					 
					 arr[j]= temp; // swaping the i+1 wiht the temp which had the firt ele
					
					
				}
				
				
				
				
	
			}
			
			
		}
		
	
		System.out.println("Second largest ele is : "+arr[n-2]);
		
	}

}
