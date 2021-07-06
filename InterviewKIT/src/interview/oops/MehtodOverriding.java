package interview.oops;

public class MehtodOverriding {

	public static void main(String[] args) {
		
		Parent p = new Child();
		Child c = new Child();
		Parent p1 = new Parent();
		System.out.println(p1.anger());
		System.out.println(p.anger());
		//System.out.println();
		System.out.println(String.valueOf(1));

	}

}

class Parent{
	
	public String smart() {
		System.out.println("Parent smar");
		return "Parent Samrt";
	}
	public String anger() {
		privateMethod();
		return "Parent anger";
	}
	
	
	private void privateMethod() throws NullPointerException {
		System.out.println("Private Methods Parent");
	}
	
	public void xyz() throws NullPointerException {
		System.out.println("Private Methods Parent");
	}
	
}
class Child extends Parent{
	
	
	public void xyz() throws RuntimeException {
		System.out.println("Private Methods Parent");
	}
	private void privateMethod() {
		System.out.println("Private Methods child");
	}
	
	
	public String smart() {
		System.out.println("SASAS");
		return "Child Samrt";
	}
	
	public String anger() {
		super.anger();
		return "Child anger";
	}
}
