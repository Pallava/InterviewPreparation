package interview.oops;

public class ClassForName {
private final String p1 ="Palal";
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
			Class c = Class.forName("interview.oops.ClassForName");
			ClassForName obj = (ClassForName)c.newInstance();
			System.out.println("Object of class/name " +obj.p1);
			
			
	}

}
