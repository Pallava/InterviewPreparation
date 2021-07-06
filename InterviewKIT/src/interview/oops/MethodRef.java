package interview.oops;

public class MethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodRef m = new MethodRef();
		MyInterface i = () -> mydisplay();
		i.display();
		MyInterface i1 = MethodRef::mydisplay;
		
		//IntegerIntf i2 =Integer::valueOf;
	}
	
	public static void mydisplay() {
		System.out.println("sasasas");
	}
	public static void z() {
		System.out.println("sasasas");
	}
	

}

@FunctionalInterface 
interface IntegerIntf{  
    void display();  
    
}
@FunctionalInterface 
interface MyInterface{  
    void display();  
    
}