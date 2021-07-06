package interview.oops;

public class MethodOverLoading {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		C1  obj  = new C1();
		obj.method1(24);
		
		System.out.println(Class.forName("String").getName());
		
	}

}

class C1{
	
	
	public void method1() {
		System.out.println("Mehod1 with no args");
		
	}
	public void method1(String name) {
		System.out.println("Mehod1 with 1 args"+name);
		
	}
	public int  method1(int age) {
		System.out.println("Mehod1 with 1 args"+age);
		return age;
		
	}
	
	
	
	//not possible to change the return type
	/*
	 * public void method1(int age) {
	 * System.out.println("Mehod1 with 1 args age->"+age);
	 * 
	 * }
	 */
	 
	
	public void method1(String name,int age) {
		System.out.println("Mehod1 with 2 args"+name+"Age"+age);
		
	}
	
}
