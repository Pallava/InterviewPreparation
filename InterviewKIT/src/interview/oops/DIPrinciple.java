package interview.oops;

public class DIPrinciple {

	public static void main(String[] args) {
		
		Carr r= new Carr(new DieselEngine());
		r.start();

	}

}



 class Carr {
    private EngineInterface engine;
    public Carr(EngineInterface e) {
        engine = e;
    }
    public void start() {
        engine.start();
    }
}
 class PetrolEngine implements EngineInterface {
   public void start() {System.out.println("Petrol");}
}
 class DieselEngine implements EngineInterface {
   public void start() {System.out.println("DieselEngine");}
}
 interface EngineInterface{
	void  start();
 }
