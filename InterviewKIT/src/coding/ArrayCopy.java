package coding;

public class ArrayCopy {

	public static void main(String[] args) {
		 int [] arr1 = new int [] {1, 2, 3, 4, 5};     
		 int arr2[] = new int[arr1.length];    
		 for (int i = 0; i < arr1.length; i++) {
			int j = arr1[i];
			arr2[i] = j;
			
		}
		 
		 for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2);
			
		}

	}

}
