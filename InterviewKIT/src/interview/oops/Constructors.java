package interview.oops;

public class Constructors {

	 int classVariable; //0
	 String g; //null
	 private final String  a ;
	 
	 Constructors(String x){
		// this.a = "";
		this.a=x;
		 
	 }
	
	public Constructors() {
		this.a = "";
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Car c= new Car();
		System.out.println(c.getName());
		c.setName("Benz");
		int i=0; //local variable to be initailized
		System.out.println();
		Constructors v= new Constructors();
		System.out.println(v.classVariable+""+v.g);
		Car c1= new Car("Maruti");
		Constructors x = new Constructors("SASAS");
		System.out.println(x.a);
	}
	
	

}

class Car{
	
	private String name;

	public Car(String name) {
		System.out.println("parameterized constructor");
		System.out.println("this.name" +this.name);
		System.out.println("Name"+name);
		this.name=name;
	}

	public Car() {
		this("Pallav");
		System.out.println("default constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
