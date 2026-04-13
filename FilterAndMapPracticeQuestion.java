package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    String name;
    Employee(String name) { this.name = name; }
}

class Student {
    String name;
    Student(String name) { this.name = name; }
}

class StudentDTO {
    String name;
    StudentDTO(String name) { this.name = name; }
}

public class FilterAndMapPracticeQuestion {
	public static void main(String[] args) {
		System.out.println("Ques1: convert all elements to uppercase using map()");
		List<String> list1 = Arrays.asList("sachin", "rahil", "amit");
		list1.stream().map((e) -> e.toUpperCase()).forEach(System.out::println);
		
		System.out.println("-----------------");
		System.out.println("Ques2: create a new list containing squares of each number");
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
		List<Integer> result = list2.stream().map((e) -> e*e).toList();
		System.out.println(result);
		
		
		System.out.println("-----------------");
		System.out.println("Ques3: extract the first character of each string");
		List<String> list3 = Arrays.asList("Java", "Python", "C");
		List<Character> result3 = list3.stream().map(s -> s.charAt(0)).collect(Collectors.toList());
		System.out.println(result3);
		
		
		System.out.println("-----------------");
		System.out.println("Ques4: Convert List of Integers to Strings");
		List<Integer> list4 = Arrays.asList(10, 20, 30);
		List<String> result4 = list4.stream()
		                         .map(String::valueOf)
		                         .collect(Collectors.toList());
		System.out.println(result4);

		
		System.out.println("-----------------");
		System.out.println("Ques5: Add Prefix to Each String");
		List<String> list5 = Arrays.asList("A", "B", "C");
		List<String> result5 = list5.stream()
		                         .map(s -> "Item-" + s)
		                         .collect(Collectors.toList());
		System.out.println(result5);

		
		System.out.println("-----------------");
		System.out.println("Ques6: Convert List of Strings to Their Lengths");
		List<String> list6 = Arrays.asList("Java", "Stream", "API");
		List<Integer> result6 = list5.stream()
		                          .map(String::length)
		                          .collect(Collectors.toList());
		System.out.println(result6);

		
		System.out.println("-----------------");
		System.out.println("Ques7: Convert List of Employees to Names");
		List<Employee> list7 = Arrays.asList(
			    new Employee("Amit"),
			    new Employee("Rahul")
			);
			List<String> result7 = list7.stream()
			                         .map(emp -> emp.name)
			                         .collect(Collectors.toList());
			System.out.println(result7);
		

		System.out.println("-----------------");
		System.out.println("Ques8: Double Each Value in List");
		List<Integer> list8 = Arrays.asList(5, 10, 15);
		List<Integer> result8 = list8.stream()
		                          .map(n -> n * 2)
		                          .collect(Collectors.toList());
		System.out.println(result8);
		

		System.out.println("-----------------");
		System.out.println("Ques9: Convert Strings to Integer");
		List<String> list9 = Arrays.asList("1", "2", "3");
		List<Integer> result9 = list9.stream()
		                          .map(Integer::parseInt)
		                          .collect(Collectors.toList());
		System.out.println(result9);
		

		System.out.println("-----------------");
		System.out.println("Ques10: Trim Spaces from Strings");
		List<String> list10 = Arrays.asList("  Java ", " Python ", " C++ ");
		List<String> result10 = list10.stream()
		                         .map(String::trim)
		                         .collect(Collectors.toList());
		System.out.println(result10);

		
		System.out.println("-----------------");
		System.out.println("Ques11: Convert Celsius to Fahrenheit");
		List<Double> celsius = Arrays.asList(0.0, 20.0, 30.0);
		List<Double> result11 = celsius.stream()
		    .map(c -> (c * 9/5) + 32)
		    .collect(Collectors.toList());
		System.out.println(result11);
		
		
		System.out.println("-----------------");
		System.out.println("Ques12: Get Last Character of Each String");
		List<String> list12 = Arrays.asList("Java", "Code");
		List<Character> result12 = list12.stream()
		    .map(s -> s.charAt(s.length() - 1))
		    .collect(Collectors.toList());
		System.out.println(result12);

		
		System.out.println("-----------------");
		System.out.println("Ques13: Convert List of Words to Their HashCodes");
		List<String> list13 = Arrays.asList("Java", "Python");
		List<Integer> result13 = list13.stream()
		                          .map(String::hashCode)
		                          .collect(Collectors.toList());
		System.out.println(result13);

		
		System.out.println("-----------------");
		System.out.println("Ques14: Append Length to Each String");
		List<String> list14 = Arrays.asList("Java", "API");
		List<String> result14 = list14.stream()
		    .map(s -> s + "-" + s.length())
		    .collect(Collectors.toList());
		System.out.println(result14);

		
		System.out.println("-----------------");
		System.out.println("Ques15: Convert List of Integers to Boolean (Even Check)");
		List<Integer> list15 = Arrays.asList(1, 2, 3, 4);
		List<Boolean> result15 = list15.stream()
		                          .map(n -> n % 2 == 0)
		                          .collect(Collectors.toList());
		System.out.println(result15);


		System.out.println("-----------------");
		System.out.println("Ques16: Convert List of Objects to Another Object");
		List<Student> list16 = Arrays.asList(
			    new Student("Ankit"),
			    new Student("Amit")
			);
			List<StudentDTO> result16 = list16.stream()
			    .map(s -> new StudentDTO(s.name))
			    .collect(Collectors.toList());
			System.out.println(result16.size());

	}
}
