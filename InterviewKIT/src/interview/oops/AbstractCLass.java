package interview.oops;

import static java.lang.Integer.*;

public class AbstractCLass {

	public static final void main(String[] args) {
		I i = new X();
		i.m1();
		System.out.println(toOctalString(100));
	}

}

abstract class MyabstractClass{
	
	String name;
	//cannot have constructos
	MyabstractClass(String name){
		this.name = "Pallava";
		
	}
	MyabstractClass(){
		System.out.println("constructor");
	}
	abstract void print();
	
	
	public void myMethod1() {
		System.out.println("my method 1 printing...........");
	}
}

interface I{
	
	public static final int myVar=10;
	
	void m1();
}


class X implements I{
	
	X(){
		
	}
	

	public X(int age) {
	
	}


	@Override
	public void m1() {
		
		
		
	}
	
}