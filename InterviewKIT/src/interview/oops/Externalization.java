package interview.oops;


//Java program to demonstrate working of Externalization
//interface
import java.io.*;
class Car1 implements Externalizable {
	static int age;
	String name;
	int year;

	public Car1()
	{
		System.out.println("Default Constructor called");
	}

	Car1(String n, int y)
	{
		this.name = n;
		this.year = y;
		age = 10;
	}

	@Override
	public void writeExternal(ObjectOutput out)
		throws IOException
	{
		out.writeObject(name);
		out.writeInt(age);
		out.writeInt(year);
	}

	@Override
	public void readExternal(ObjectInput in)
		throws IOException, ClassNotFoundException
	{
		name = (String)in.readObject();
		year = in.readInt();
		age = in.readInt();
	}

	@Override public String toString()
	{
		return ("Name: " + name + "\n"
				+ "Year: " + year + "\n"
				+ "Age: " + age);
	}
}

public class Externalization {
	public static void main(String[] args)
	{
		Car1 car = new Car1("Shubham", 1995);
		Car1 newcar = null;

		// Serialize the car
		try {
			FileOutputStream fo
				= new FileOutputStream("gfg.txt");
			ObjectOutputStream so
				= new ObjectOutputStream(fo);
			so.writeObject(car);
			so.flush();
		}
		catch (Exception e) {
			System.out.println(e);
		}

		// Deserializa the car
		try {
			FileInputStream fi
				= new FileInputStream("gfg.txt");
			ObjectInputStream si
				= new ObjectInputStream(fi);
			newcar = (Car1)si.readObject();
		}
		catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("The original car is:\n" + car);
		System.out.println("The new car is:\n" + newcar);
	}
}

