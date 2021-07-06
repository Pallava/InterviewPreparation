package interview.oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

	public static void main(String[] args) {
		List<String> loans = new ArrayList<>();
	loans.add("personal loan"); loans.add("home loan"); loans.add("auto loan"); 
	loans.add("credit line loan"); loans.add("mortgage loan"); loans.add("gold loan"); 
	// printing ArrayList before removing any element System.out.println(loans); 
	// removing element using ArrayList's remove method during iteration 
	// This will throw ConcurrentModification 
	Iterator<String> itr = loans.iterator(); 
	while (itr.hasNext()) {
		String loan = itr.next();
		if (loan.equals("personal loan")) { 
			itr.remove(); 
			} 
		} // printing ArrayList after removing an element 
	System.out.println(loans); 
	}
	}


