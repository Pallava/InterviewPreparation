package com.interviews.DesignPattern;

public class PrototypePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1,"Pallava","SSE/Lead");
		emp.showRecord();
		System.out.println("sasas"+emp.toString());
		 System.out.println("\n");  
		 Employee e2=(Employee) emp.getClone();  
	        e2.showRecord();  

	}

}

interface Prototype{
	
	Prototype getClone();
}

class Employee implements Prototype {
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}

	private int id;
	private String name;
	private String designation;
	
	Employee(int id , String name, String designation){
		this();
		this.id=id;
		this.name = name;
		this.designation = designation;
	}
	public void showRecord(){  
        
        System.out.println(id+"\t"+name+"\t"+designation+"\t");  
   }  

	public Employee() {
		 System.out.println("   Employee Records of Oracle Corporation ");  
         System.out.println("---------------------------------------------");  
        // System.out.println("Eid"+"\t"+"Ename"+"\t"+"Edesignation"+"\t"+"Esalary"+"\t\t"+"Eaddress");  
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public Prototype getClone() {
		return new Employee(id, name, designation);
	}

}