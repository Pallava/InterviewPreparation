package interview.oops;

class Finalize {
	static Finalize a = null;

	public static void main(String[] args) {
		Finalize b = new Finalize();
		System.out.println(b.hashCode());
		b = new Finalize();
		System.gc(); // System.out.println( a.hashCode() );
	}

	public void finalize() {
		System.out.println("finaliz1e method");
		a = this;
		System.out.println(a.hashCode());
		System.out.println("finalize method");
	}
}
