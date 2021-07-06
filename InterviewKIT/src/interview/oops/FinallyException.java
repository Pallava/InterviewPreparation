package interview.oops;

import java.io.IOException;

public class FinallyException {

	private FinallyException(){
		
	}
	
	public static void main(String[] args) throws IOException {
		
		FinallyException fe = new FinallyException();
		fe.a();
		System.out.println("After finally");

	}
	
	@SuppressWarnings("finally")
	void a() throws IOException  {
		try {
			b();
		}catch(Exception e){
			System.out.println("I caught"+e.getMessage());
		}finally {
			System.out.println("Finally !!");
			throw new IOException("device failure");
		}
		
	}
	
	void b() {
		System.out.println("Arithmetic exception");
		throw new ArithmeticException("Arithmetic exception String");
	}

}

