package interview.oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SubstringDemo {

	public static void main(String[] args) {

		String str="Pallava";
		System.out.println(str.substring(3,4)); //begin-.inclusive , end exclusive
		System.out.println(str);
		
		//max occurance of a charatcter string
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if(!hm.containsKey(c)) {
				hm.put(c, 0);
			}else {
				hm.put(c, hm.get(c)+1);
			}
			
		}
		
		System.out.println(hm);
		List<Entry<Character, Integer>> l= new ArrayList<Entry<Character, Integer>>(hm.entrySet());
	
		
		for (Entry<Character, Integer> c : hm.entrySet()) {
			
			
			
			
		}
		
	}

}
