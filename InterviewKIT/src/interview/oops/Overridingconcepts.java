package interview.oops;

import java.io.IOException;

public class Overridingconcepts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated meth(od stub
		SuperHero s = new IronMan();
		s.infinityStone();
		SuperHero sh =new SuperHero();
		SuperHero.b();
		s.b();
		IronMan i = new IronMan();
		i.b();
		
		
		

	}

}

class SuperHero{
	
	public void smart() throws RuntimeException{
		System.out.println("Super hero smart");
	}
	
	public void good()  {
		System.out.println("Super hero good");
	}
	
	public void playboy() throws  Exception{
		System.out.println("play bouy");
	}
	
	public void superPower() {
		System.out.println("play bouy");
	}
	
	public void infinityStone() throws Exception{
		System.out.println("none");
	}
	
	private void a() {
		System.out.println("sss1");
	}
	
	public static void b() {
		System.out.println("bbbbbbbb SuperHero");
	}
}
class IronMan extends SuperHero{
	public static void b() {
		System.out.println("bbbbbbbb IronMan");
	}
	private void a() {
		System.out.println("sss");
	}
	
	public void smart() {
		System.out.println("IronMan  smart");
	}
	
	public void good() throws RuntimeException {
		System.out.println("Ironman hero good");
	}
	
	public void playboy() throws IOException {
		System.out.println("play bouy");
	}
	
	/*
	 * public void superPower() throws Exception{
	 * System.out.println("suits are my super power"); }
	 */
	
	public void infinityStone()  {
		System.out.println("none");
	}
}