package interview.oops;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashcodeEquals {

	public static void main(String[] args) {
		
		HashMap<Employee,String> hm = new HashMap<Employee,String>();
		hm.put(new Employee("Pallava"), "TEST");
		hm.put(new Employee("Pallava"), "TEST");
		hm.put(new Employee("Sanjana"), "TEST");
		for (Entry<Employee, String> string : hm.entrySet()) {
			System.out.println(string.getKey().getName());
		}
		
	}

}

class Employee{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	
	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + ((name == null) ? 0 : name.hashCode()); return
	 * result; }
	 */
	  
	  @Override public boolean equals(Object obj) { if (this == obj) return true;
	  if (obj == null) return false; if (getClass() != obj.getClass()) return
	  false; Employee other = (Employee) obj; if (name == null) { if (other.name !=
	  null) return false; } else if (!name.equals(other.name)) return false; return
	  true; }
	  
	 
	
	
	
}
