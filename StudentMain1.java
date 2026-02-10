package enc;

import java.util.ArrayList;

//Fundamental of encapsulation.
class Student{
	private String name;
	private String course;
	private int sid;
	public Student(String name, String course, int sid) {  //generating using shortcut 
		super();                                        //right click source generate constructor
		this.name = name;
		this.course = course;
		this.sid = sid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public String getCourse() {
		return course;
	}
	
}

public class StudentMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1 = new Student("Student1", "MCA", 1);
//		System.out.println("Sid: "+s1.getSid());
//		System.out.println("Name: "+s1.getName());
//		System.out.println("Course: "+s1.getCourse());
		
		ArrayList<Student> studentInfo = new ArrayList<Student>();
		
		
		studentInfo.add(new Student("Student1", "MCA", 1));
		studentInfo.add(new Student("Student2", "MCA", 2));
		studentInfo.add(new Student("Student3", "MCA", 3));
		studentInfo.add(new Student("Student4", "MCA", 4));
		studentInfo.add(new Student("Student5", "MCA", 5));
		System.out.println("Student ID\t\tName\t\tCourse");
		for(Student s : studentInfo) {
			String result = String.format("\t%d\t%s\t%s", s.getSid(), s.getName(), s.getCourse()); //for formatting and printing data.
			System.out.println(result);
		}
	}
}
