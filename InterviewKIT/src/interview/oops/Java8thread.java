package interview.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t  = new Thread(()-> {System.out.println("run");}) ;
		t.start();
		List<String> name = new ArrayList<String>();
		name.stream().filter(x->x.length()>5).collect(Collectors.toList());
		name.stream().filter(x->x.length()>5).distinct();
	}

}


