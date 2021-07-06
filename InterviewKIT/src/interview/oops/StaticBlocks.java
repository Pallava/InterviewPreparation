package interview.oops;

public class StaticBlocks {
	static StaticBlocks sb;
	static String name;
	String classVariable;
	StaticBlocks(String name){
		this.classVariable = name;
	}
	public StaticBlocks() {
		// TODO Auto-generated constructor stub
	}
	static {
		
		sb = new StaticBlocks("OOOOOO");
		//setName();
		
	}
	
	public static void main(String[] args) {
		/* StaticBlocks sb= new StaticBlocks(); */
		StaticBlocks sb1= new StaticBlocks();
		int i = 0;
		
		System.out.println("Clas variable ->"+sb.getClassVariable());
		
		System.out.println(sb.name);
		sb.setClassVariable("Sanjana");
		System.out.println(sb1.name);
		System.out.println(sb.getClassVariable());

	}



	public String getClassVariable() {
		return classVariable;
	}
	public void setClassVariable(String classVariable) {
		this.classVariable = classVariable;
	}

	
	
}
