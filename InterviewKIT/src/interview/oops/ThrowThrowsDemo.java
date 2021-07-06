package interview.oops;

import java.io.IOException;

public class ThrowThrowsDemo {

	void m(){  
	    throw new IOException("device error");//checked exception  are not propagated
	  }  
	  void n(){  
	    m();  
	  }  
	  void p(){  
	   try{  
	    n();  
	   }catch(Exception e){System.out.println("exception handeled");}  
	  }  
	  public static void main(String args[]){  
		  ThrowThrowsDemo obj=new ThrowThrowsDemo();  
	   obj.p();  
	   System.out.println("normal flow");  
	  }  

}

class AgeIsMore extends Exception{
	
	AgeIsMore(String name){
		super(name);
	}
	
}
