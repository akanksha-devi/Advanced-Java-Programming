package streamsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

class Employees{
	int eid;
	String name;
	double salary;
	int age;
	String dept;
	public Employees(int eid, String name, double salary, int age, String dept) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}
	public String getDept() {
		return dept;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + ", age=" + age + ", dept=" + dept
				+ "]";
	}
	
}
public class SortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employees> empList = new ArrayList<>(Arrays.asList(
		        new Employees(101, "Amit", 50000, 25, "IT"),
		        new Employees(102, "Neha", 60000, 28, "HR"),
		        new Employees(103, "Ravi", 45000, 24, "IT"),
		        new Employees(104, "Karan", 70000, 30, "Finance"),
		        new Employees(105, "Pooja", 55000, 27, "HR"),
		        new Employees(106, "Rohit", 80000, 32, "IT"),
		        new Employees(107, "Simran", 65000, 29, "Finance"),
		        new Employees(108, "Amit", 50000, 25, "IT")
		));
		Optional<Employees> minSalary= empList.stream().min((a,b) ->(int)a.getSalary() - (int)b.getSalary());
		minSalary.ifPresent(System.out::println);

		Optional<Employees> maxSalary= empList.stream().min((a,b) ->(int)b.getSalary() - (int)a.getSalary());
		maxSalary.ifPresent(System.out::println);

		Optional<Employees> minAge= empList.stream().min((a,b) ->a.getAge() - b.getAge());
		minAge.ifPresent(System.out::println);

		Optional<Employees> maxAge= empList.stream().min((a,b) ->b.getAge() - a.getAge());
		maxAge.ifPresent(System.out::println);

		//Question9
		
		System.out.println("Question 9");
		System.out.println("----------------------");
		empList.stream()
				.collect(Collectors.toMap(
						Employees::getName,
						e -> e,
						(e1, e2) -> e1
						))
				.values()
				.forEach(System.out::println);
		
		System.out.println("----------------------");
		System.out.println("Question 11");
		Employees result = empList.stream()
		.filter((e) -> e.getDept().equals("IT"))
		.min(Comparator.comparing(Employees::getSalary))
		.get();
		System.out.println(result);
		
		System.out.println("----------------------");
		System.out.println("Question 12");
		Employees result1 = empList.stream()
		.filter((e) -> e.getDept().equals("HR"))
		.max(Comparator.comparing(Employees::getSalary))
		.get();
		System.out.println(result1);
		
		System.out.println("----------------------");
		System.out.println("Question 13");
		Employees result2 = empList.stream()
		.filter((e) -> e.getAge() > 25)
		.min(Comparator.comparing(Employees::getSalary))
		.get();
		System.out.println(result2);
		
		System.out.println("----------------------");
		System.out.println("Question 14");
		Employees result3 = empList.stream()
		.filter((e) -> e.getAge() < 30)
		.max(Comparator.comparing(Employees::getSalary))
		.get();
		System.out.println(result3);
		
		System.out.println("----------------------");
		System.out.println("Question 15");
		empList.stream()
		.limit(5)
		.forEach(System.out::println);
		
		System.out.println("----------------------");
		System.out.println("Question 16");
		empList.stream()
		.skip(3)
		.forEach(System.out::println);
		
		System.out.println("----------------------");
		System.out.println("Question 17");
		empList.stream()
		.sorted(Comparator.comparing(Employees::getAge)).limit(2)
		.forEach(System.out::println);
		
		System.out.println("----------------------");
		System.out.println("Question 18");
		empList.stream()
		.sorted(Comparator.comparing(Employees::getAge)).skip(2)
		.limit(2)
		.forEach(System.out::println);
		
		System.out.println("----------------------");
		System.out.println("Question 19");
		System.out.println("Top 3 highest salary from IT department");
//		empList.stream()
//		.filter((e) -> e.getSalary().equals("IT"))
//		.max(Comparator.comparing(Employees::getSalary))
//		.forEach(System.out::println);
	}

}
