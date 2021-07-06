package interview.oops;

public class ImmutableClassDemo {

	public static void main(String[] args) {
		
		Address adre1 = new Address("100","Bangalre","Karnataka",510000);
		ImmutableClass cs = new ImmutableClass("Pallava", adre1);
		System.out.println(cs);
		cs.getAddress().setCity("udupi");
		System.out.println(cs);
		Address adre2 = new Address("121","Mangalore","Karnataka",42323);
		ImmutableClass cs1 = new ImmutableClass("Pallava", adre2);
		cs1.getAddress().setPincode(1212122);
		System.out.println(cs1);
		
		
		/*
		 * Integer i = new Integer(10); Integer j = new Integer(20); swap(i, j);
		 * System.out.println("i = " + i + ", j = " + j);
		 * 
		 * int[] arr = {1,2,3,4}; call(arr[0],arr);
		 * System.out.println(arr[0]+","+arr[1]); // 1 , 2
		 */	}
	
	public static void call(int i,int [] j){
		j[i] = 5; 
		i=6;
		}

	
	public static void swap(Integer i, Integer j) 
	   {
	      Integer temp = new Integer(i);
	      i = j;
	      j = temp;
	   }

}


final class ImmutableClass{
	
	private final String name;
	
	private Address address;
	
	
	
	
	ImmutableClass(String name,Address adr){
		
		this.name=name;
	/*	this.address=adr; //shallow copy
*/		Address cloneAdr = new Address();
		cloneAdr.setCity(adr.getCity());
		cloneAdr.setLane(adr.getLane());
		cloneAdr.setPincode(adr.getPincode());
		cloneAdr.setState(adr.getState());
		this.address=cloneAdr;
	}

	public Address getAddress() {
		Address cloneAdr = new Address();
		cloneAdr.setCity(this.address.getCity());
		cloneAdr.setLane(this.address.getLane());
		cloneAdr.setPincode(this.address.getPincode());
		cloneAdr.setState(this.address.getState());
		return cloneAdr;
	}

	

	@Override
	public String toString() {
		return "ImmutableClass [name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}
	
	
}

class Address{
	
	private String lane;
	private String city;
	private String state;
	private int pincode;
	
	
	
	public Address(String lane, String city, String state, int pincode) {
		super();
		this.lane = lane;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		// TODO Auto-generated constructor stub
	}
	public String getLane() {
		return lane;
	}
	public void setLane(String lane) {
		this.lane = lane;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [lane=" + lane + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
}
