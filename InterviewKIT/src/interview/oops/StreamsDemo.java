package interview.oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		
		Integer [] intArray1 = {1,3,4,5,67,8};
		
		List<Integer> intList1 =   Arrays.asList(intArray1);
		intList1.stream().filter(x->x%2==0).forEach(System.out::println);
		intList1.stream().map(x->x*2).forEach(System.out::println);
		List<Employees> empList = getEmployeess();
		List<String> list = Arrays.asList("Pallava","Pallava","Sanjana");
		List<Integer> intListduplicates = Arrays.asList(10,22,10,22,33,44,55,6,6,6,6,6);
		Map<Object,Long> result1 = intListduplicates.stream().collect(Collectors.groupingBy(Integer::valueOf,Collectors.counting()));
		result1.forEach((k,v)-> System.out.println("Key->"+k + ", Value ->"+v));
		list.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
		Map<Object,Long> resultant = list.stream().collect(Collectors.groupingBy(String::valueOf,Collectors.counting()));
		System.out.println("resultant"+resultant);
		Integer [] intArray = {10,20,30,40};
		List<Integer> intList2= Arrays.asList(intArray);
		intList2.stream().map((i)-> i*2).collect(Collectors.toList()).forEach(System.out::println);;
		Optional<Integer> opt3 = intList2.stream().reduce((a,b)->a*b);
		
		System.out.println("Multiples"+opt3.get());
		
		System.out.println("Counting"+empList.stream().filter(q->q.getName().startsWith("A")).count());
		empList.stream().collect(Collectors.groupingBy(Employees::getDepartment,Collectors.groupingBy(Employees::getSalary)));
		
		List<Integer> intList = Arrays.asList(45,55,11,22);
		Map<Object, Long>map = list.stream().collect(Collectors.groupingBy(String::valueOf , Collectors.counting()));
		System.out.println("Map-->"+map);
		list.stream().collect(Collectors.toSet()).forEach(System.out::println);
		Integer val = intList.stream().collect(Collectors.minBy(Comparator.comparingInt(Integer :: valueOf))).get();
		System.out.println("MAXXXXX->"+val);
		//1.How many male and female Employees are there in the organization?
		Map<String,Long>  map1 = empList.stream().collect(Collectors.groupingBy(Employees :: getGender,Collectors.counting()));
		map1.forEach((k,v) -> System.out.println(k +" "+ v));
		//2.Print the name of all departments in the organization?
		System.out.println("2.Print the name of all departments in the organization?");
		
		Function<Employees, String> func = e -> e.getDepartment();
		
		empList.stream().map(func).collect(Collectors.toSet()).forEach(s->System.out.println(s));
		//3.What is the average age of male and female Employees?
		System.out.println("3.What is the average age of male and female Employees?");
		empList.stream().collect(Collectors.groupingBy(Employees::getGender , Collectors.averagingDouble(Employees::getAge))).forEach((k,v)->System.out.println(k +"->"+v));
		//4.Get the details of highest paid Employees in the organization?
		
		Employees emp = empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employees::getSalary))).get();
		Stream<Employees> emps  = empList.stream().sorted(Comparator.comparingDouble(Employees::getSalary));
		System.out.println(emp.toString());
		Employees max = emps.max(Comparator.comparingDouble(Employees::getSalary)).get();
		System.out.println(max);
		
		//5. Get the names of all Employees who have joined after 2015
		System.out.println("5. Get the names of all Employees who have joined after 2015");
		empList.stream().filter(e->e.getYearOfJoining()>2015).collect(Collectors.toList()).forEach(a->System.out.println(a.getName()));
		
		//Count the number of Employees in each department?
		System.out.println("Count the number of Employees in each department?");
		empList.stream().collect(Collectors.groupingBy(Employees::getDepartment,Collectors.counting())).forEach((k,v)->System.out.println(k+"->"+v));
		//What is the average salary of each department
		System.out.println("What is the average salary of each department");
		empList.stream().collect(Collectors.groupingBy(Employees::getDepartment,Collectors.averagingDouble(Employees::getSalary))).forEach((k,v)->System.out.println(k+"->"+v));
		// Get the details of youngest male Employees in the product development department?
		System.out.println(" Get the details of youngest male Employees in the product development department?");
		Employees empsMin = empList.stream().filter(x->x.getDepartment().equalsIgnoreCase("Product Development")).collect(Collectors.minBy(Comparator.comparingInt(Employees::getAge))).get();
		System.out.println(empsMin);
		
		//Who has the most working experience in the organization?
		System.out.println("Who has the most working experience in the organization?");
		Employees empsMin1 = empList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employees::getYearOfJoining))).get();
		System.out.println(empsMin1);
		// How many male and female Employees are there in the sales and marketing team
		System.out.println(" How many male and female Employees are there in the sales and marketing team");
		empList.stream().filter(x->x.getDepartment().equalsIgnoreCase("Sales And Marketing")).collect(Collectors.groupingBy(Employees::getGender,Collectors.counting())).forEach((k,v)->System.out.println(k+"->"+v));;
	
		//What is the average salary of male and female Employees?
		System.out.println("What is the average salary of male and female Employees?");
		empList.stream().collect(Collectors.groupingBy(Employees::getGender,Collectors.averagingDouble(Employees::getSalary))).forEach((k,v)->System.out.println(k+"->"+v));
		
		
		//List down the names of all Employees in each department?
		empList.stream().collect(Collectors.groupingBy(Employees::getDepartment)).forEach((k,v)->System.out.println(k+"->"+v));
		
		//What is the average salary and total salary of the whole organization
		System.out.println("What is the average salary and total salary of the whole organization");
		DoubleSummaryStatistics d = empList.stream().collect(Collectors.summarizingDouble(Employees::getSalary));
		System.out.println(d);
		
		//Separate the Employees who are younger or equal to 25 years from those Employees who are older than 25 years.
		System.out.println("Separate the Employees who are younger or equal to 25 years from those Employees who are older than 25 years.");
	//	empList.stream().coll
		
		Map<Character,Integer> hm = new HashMap<Character,Integer>();
		String str ="aaahhhnnnn";
		char [] a = str.toCharArray();
		for (int i = 0; i < a.length ; i++)
		{
			//; 
	
		int count = 0;
		if(!hm.containsKey(a[i])){
		hm.put(Character.valueOf(a[i]), count);
		}else{
		hm.put(a[i] , hm.get(a[i])+1);
		}
		}
		/*System.out.println("PALLAVA"+5+4);
		System.out.println(5+4+"Pallava");
		for (int i=0;0;i++) {
			System.out.println("shshs");
		}*/
		//hm.entrySet().stream().collect(Collectors.maxBy(Comparator.comparingInt()));

		
		long countOFAge25Emp = empList.stream().filter(aemp-> aemp.getAge() == 25).count();
		System.out.println("Count of empls where age = 25 is ->"+countOFAge25Emp);
		
		
		
		Optional<Employees>optional = empList.stream().findAny();
		if(optional.isPresent()) {
			System.out.println("FIND ANY->"+optional.get());
		}
		List<String> al = Arrays.asList();
		Optional<String>optional2 = al.stream().findAny();
		Optional<Employees>optional3 = empList.stream().filter(ss->emp.getAge() >90).findAny();
		Optional<Employees>optional4 = empList.stream().filter(ss->emp.getAge() >24).findFirst();
		
		if(optional4.isPresent()) {
			System.out.println("FIND FIRST ->"+optional4.get());
		}
		if(optional3.isPresent() ) {
			System.out.println("YES - >"+optional3.get());
			
		}else {
			System.out.println(optional3.orElseThrow(()-> new IllegalArgumentException("Empls abset")));
		}
		if(optional2.isPresent()) {
			System.out.println("FIND ANY->"+optional.get());
		}else {
			System.out.println("EMP?TY");
		}
		
	}

	private static List<Employees> getEmployeess() {
		List<Employees> EmployeesList = new ArrayList<Employees>();
        
		EmployeesList.add(new Employees(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		EmployeesList.add(new Employees(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		EmployeesList.add(new Employees(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		EmployeesList.add(new Employees(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		EmployeesList.add(new Employees(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		EmployeesList.add(new Employees(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		EmployeesList.add(new Employees(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		EmployeesList.add(new Employees(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		EmployeesList.add(new Employees(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		EmployeesList.add(new Employees(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		EmployeesList.add(new Employees(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		EmployeesList.add(new Employees(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		EmployeesList.add(new Employees(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		EmployeesList.add(new Employees(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		EmployeesList.add(new Employees(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		EmployeesList.add(new Employees(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		EmployeesList.add(new Employees(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		return EmployeesList;

	}

}

class EmplSalcomparator implements Comparator<Employees>{

	@Override
	public int compare(Employees o1, Employees o2) {
		if( o1.getSalary() > o2.getSalary()) return 1;
		else if( o1.getSalary() < o2.getSalary()) return -1;
		else return 0;
	}
	
}
class Employees
{
    int id;
     
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public Employees(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
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
     
    public String getName() 
    {
        return name;
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
     
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
}
