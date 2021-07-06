package interview.oops;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Cycle detected: a cycle exists in the type hierarchy between Y and X
class X extends Y{
	
}
 class Y extends X {
	 
 }