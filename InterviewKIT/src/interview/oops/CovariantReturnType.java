package interview.oops;

public class CovariantReturnType {

	public static void main(String[] args) {
		
		
		P p = new C();
		p.getP();

	}
	
	
	

}


class P{
	
	P getP() {
		return new P();
	}
	
	
} 

class C extends P{
	
	C getP() {
		return new C();
	}
}