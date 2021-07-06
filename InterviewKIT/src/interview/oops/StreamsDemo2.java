package interview.oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsDemo2{
	
	public static void main(String[] args) {
		
		
		Optional<List<EmployeesDemo>> empList = getEmployeess();
		List<EmployeesDemo> demop = new ArrayList<EmployeesDemo>();
		List<EmployeesDemo> emps=  empList.orElseGet(() ->demop);
		emps.stream().sorted(new Comparator<EmployeesDemo>() {

			@Override
			public int compare(EmployeesDemo o1, EmployeesDemo o2) {
				if(o1.getFname().compareTo(o2.getFname())==0) {
					return  new Double(o1.getSalary()).compareTo(new Double(o2.getSalary()));
				}
				return o2.getFname().compareTo(o1.getFname());
				
			}
		}).forEach(System.out::println);
		
		//
		/*
		 * Map<String, Long> map
		 * =emps.stream().collect(Collectors.groupingBy(EmployeesDemo::getDepartment,
		 * Collectors.counting())); System.out.println(map);
		 */
		
		//emp
		emps.stream().filter(e->e.getFname().startsWith("M")).collect(Collectors.toList()).forEach(System.out::println);
		
		List<Integer> intArray = Arrays.asList(10,20,30,40);
		IntSummaryStatistics a= intArray.stream().collect(Collectors.summarizingInt(Integer::valueOf));
		System.out.println(a.getSum());
		IntStream d = intArray.stream().mapToInt(e->e*2);
		System.out.println(d.toString());
		
	}

	public static Optional<List<EmployeesDemo>> getEmployeess() {

		List<EmployeesDemo> EmployeesList = new ArrayList<EmployeesDemo>();
        
		EmployeesList.add(new EmployeesDemo(111, "Jiya","Brein", 32, "Female", "HR", 2011, 25000.0));
		EmployeesList.add(new EmployeesDemo(122, "Paul","Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		EmployeesList.add(new EmployeesDemo(133, "Martin","Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		EmployeesList.add(new EmployeesDemo(144, "Murali","Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		EmployeesList.add(new EmployeesDemo(155, "Nima","Roy", 27, "Female", "HR", 2013, 22700.0));
		EmployeesList.add(new EmployeesDemo(166, "Iqbal","Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		EmployeesList.add(new EmployeesDemo(177, "Manu","Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		EmployeesList.add(new EmployeesDemo(188, "Wang","Liu", 31, "Male", "Product Development", 2015, 34500.0));
		EmployeesList.add(new EmployeesDemo(199, "Amelia","Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		EmployeesList.add(new EmployeesDemo(200, "Jaden","Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		EmployeesList.add(new EmployeesDemo(211, "Jasna","Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		EmployeesList.add(new EmployeesDemo(222, "Nitin","Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		EmployeesList.add(new EmployeesDemo(233, "Jyothi","Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		EmployeesList.add(new EmployeesDemo(244, "Nicolus","Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		EmployeesList.add(new EmployeesDemo(255, "Ali","Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		EmployeesList.add(new EmployeesDemo(266, "Sanvi","Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		EmployeesList.add(new EmployeesDemo(277, "Anuj","Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		EmployeesList.add(new EmployeesDemo(277, "Anuj","Shetty", 32, "Male", "Product Development", 2012, 34700.0));
		EmployeesList.add(new EmployeesDemo(277, "Pallav","Shetty", 32, "Male", null, 2012, 34700.0));
		return Optional.ofNullable(EmployeesList);

	
	}
	
	
}

class EmployeesDemo
{
    int id;
     
    String Fname;
    String Lname;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public EmployeesDemo(int id, String Fname,String Lname, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
     
    public int getId() 
    {
        return id;
    }
     
 
     
    public int getAge() 
    {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
    }
     
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
        return salary;
    }

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", age=" + age + ", gender=" + gender
				+ ", department=" + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
     
   
}
