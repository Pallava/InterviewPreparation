package interview.oops;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamsDemo2.getEmployeess();
		Optional<Object> optional = Optional.empty();
		System.out.println(optional);
		
		Customer customer = new Customer("Pallava",null,"11290");
		/*
		 * //if object we are passing is not null then can go for Optional.of
		 * //Optional<String> email =Optional.of(customer.getEmail()); //does noull
		 * checke //System.out.println(email); Optional<String> email2 =
		 * Optional.ofNullable(customer.getEmail());
		 * System.out.println("Of nullable"+email2); //chceks if null or not if null
		 * then returns empty option object //may or may not be nukll
		 * 
		 * //to print value if(email2.isPresent()) {
		 * System.out.println("Value is "+email2.get()); }
		 * 
		 * //System.out.println(email2.orElse("pallav.shetty@gmail.com"));
		 * System.out.println(email2.orElseThrow(()->new
		 * IllegalArgumentException("null for email")));
		 */

		Customer customer1 = new Customer("Sanajana","san@gmail.com","11290");
		Optional<String> optionalObj  = Optional.ofNullable(customer1.getEmail()); //null or not null
		System.out.println(optionalObj.get());
		
		//Null pointer
		/*
		 * Customer customer2 = new Customer("Sanajana",null,"11290"); Optional<String>
		 * optionalObj2 = Optional.of(customer2.getEmail()); //if u r suree it has value
		 * then use of System.out.println(optionalObj2);
		 */
		//if not present then is present is false
		Customer customer3= new Customer("Sanajana",null,"11290");
		Optional<String> optionalObj3  = Optional.ofNullable(customer3.getEmail()); 
		if(optionalObj3.isPresent()) {
			System.out.println("Is present chceck"+optionalObj3.get());
		}
		//if present is present is true and use get() to get the value <Supplier>
		Customer customer4= new Customer("Sanajana","sanju@gmail.com","11290");
		Optional<String> optionalObj4  = Optional.ofNullable(customer4.getEmail()); 
		if(optionalObj4.isPresent()) {
			System.out.println("Is present chceck -- - - - >"+optionalObj4.get());
		}
		
		//orElse -> will check null else take the deafault value
		Customer customer5= new Customer("Sanajana",null,"11290");
		Optional<String> optionalObj5  = Optional.ofNullable(customer5.getEmail()); 
		System.out.println("If else -->"+optionalObj5.orElse("deafult@gmail.com"));
		
		Customer customer6= new Customer("Sanajana","sansa@gmail.com","11290");
		Optional<String> optionalObj6  = Optional.ofNullable(customer6.getEmail());
		System.out.println("Or else throw - > " + optionalObj6.orElseThrow(() -> new IllegalArgumentException(" Illegal Args Exception")));
		
		Customer customer7= new Customer("Sanajana",null,"11290");
		Optional<String> optionalObj7  = Optional.ofNullable(customer7.getEmail()); 
		System.out.println("Or else get - > "+optionalObj7.orElseGet(()->"default./../"));
		
		
	}

}

class Customer{
	private String name;
	private String email;
	private String id;
	
	public Customer(String name, String email, String id) {
		super();
		this.name = name;
		this.email = email;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
}
