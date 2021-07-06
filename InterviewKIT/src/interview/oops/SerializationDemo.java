package interview.oops;


//Java code for serialization and deserialization
//of a Java object
import java.io.*;

class Demo implements java.io.Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int a;
	public String b;
	public static String str ="Pallava";
	private  SerChildRef serChildRef;

	// Default constructor
	public Demo(int a, String b, SerChildRef ref)
	{
		this.a = a;
		this.b = b;
		this.serChildRef=ref;
	}

	public Demo(int a2, String b2) {
		this.a=a2;
		this.b=b2;
	}

	public SerChildRef getSerChildRef() {
		return serChildRef;
	}

	public void setSerChildRef(SerChildRef serChildRef) {
		this.serChildRef = serChildRef;
	}
	
	

}

class SerializationDemo
{
	public static void main(String[] args)
	{
		SerChildRef ref= new SerChildRef(1,"sas");
		ref.setName("Pallava");
		Demo object = new Demo(1, "geeksforgeeks",ref);
		String filename = "file.ser";
		
		// Serialization
		try
		{
			//Saving of object in a file
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// Method for serialization of object
			out.writeObject(object);
			
			out.close();
			file.close();
			
			System.out.println("Object has been serialized");

		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}


		Demo object1 = null;

		// Deserialization
		try
		{
			// Reading the object from a file
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			// Method for deserialization of object
			object1 = (Demo)in.readObject();
			
			in.close();
			file.close();
			
			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
			System.out.println("b = " + object1.str);
			System.out.println("ref = "+object1.getSerChildRef());
		}
		
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}

	}
}

class SerChildRef extends Demo{
	
	public SerChildRef(int a, String b ) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

