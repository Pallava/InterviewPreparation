package coding;

public class SecondLargestinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer [] arrr = {100,2,30,22,93,44,80};
		
		
		int largest = 0;
		int secondLargest = 0;
		
		for (int i = 0; i < arrr.length; i++) {
			
			if(arrr[i] > largest) {
				secondLargest = largest;
				largest=arrr[i];
				
				
			}else if(arrr[i]>secondLargest) {
				
				secondLargest=arrr[i];
			
			}
			
			
		}
		
		System.out.println("largest"+largest);
		System.out.println("2nd largets"+secondLargest);
		
		

	}

}
