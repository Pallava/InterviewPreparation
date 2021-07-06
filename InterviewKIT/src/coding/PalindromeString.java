package coding;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABBA";
		int  i = isPlaindrome(str) ? 1 : 0;
		System.out.println(i);

	}

	private static boolean isPlaindrome(String str) {
		char [] strArray = str.toCharArray();
		
		int length =  strArray.length;
		double half= length/2;
		if(half %2!=0) {
			return false;
		}else {
			
			int high = length;
			int low = 0;
			while(high > low) {
				 if(strArray[low++]!=strArray[high--]) {
					 return false;
				 }
				
			}
			return true;
					
			
			
			
		}
	}

	/*
	 * private static boolean isPlaindrome(String str) {
	 * 
	 * StringBuffer sb = new StringBuffer(str); return
	 * str.equalsIgnoreCase(sb.reverse().toString());
	 * 
	 * 
	 * }
	 */
	
	

}
