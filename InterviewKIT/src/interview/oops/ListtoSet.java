package interview.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListtoSet {

	public static List<String> getList(){
		List<String> loans = new ArrayList<>();
		loans.add("personal loan"); loans.add("home loan"); loans.add("auto loan"); 
		loans.add("credit line loan"); loans.add("mortgage loan"); loans.add("gold loan"); 
		loans.add("credit line loan");
		return loans;
	}
	
	public static void main(String[] args) {
		
		List<String>list1= getList();
	
		Set<String> mySet = new HashSet<String>(list1);
		System.out.println("List to set"+mySet);
		
		Set<String> myTreeset = new TreeSet<String>(list1);
		
		System.out.println("List to treset"+myTreeset);
		
		
		
		//remove duplicates from AL
		Set<String> unqueset = new HashSet<String>(list1);
		
		System.out.println("Before removing duplicTES"+list1);
		list1.clear();
		list1.addAll(unqueset);
		System.out.println("Unique loans"+list1);
		System.out.println(list1.hashCode());
		List<String>list2= getList();
		System.out.println(list2.hashCode());
		Set<String>lhs = new LinkedHashSet<String>(list2);
		list2.clear();
		list2.addAll(lhs);
		System.out.println(list2);
		ListtoSet i1= new ListtoSet();
		ListtoSet i2 = new ListtoSet();
	
		List<String> objList = Collections.emptyList();
	
		System.out.println(objList);
		List<String> dest = new ArrayList<String>(100);
		Collections.copy(dest, list1);
		System.out.println(dest);
		
		

	}
	
	

}
