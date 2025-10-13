package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student>{
	int age;
	String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	public int compareTo(Student that) {
		if(this.age > that.age)
			return 1;
		else 
			return -1;
	}
}

public class ComparableDemo {
	
	public static void main(String[] args) {
		
//		Comparator<Student> com = new Comparator<Student>() {
//			public int compare(Student i, Student j) {
//				if(i.age > j.age)
//					return 1;
//				else 
//					return -1;
//			}
//			
//		};
		
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(22, "Akash"));
		studs.add(new Student(21, "Nandhini")); 
		studs.add(new Student(24, "Shneha"));
		studs.add(new Student(25, "Girija"));
		
		Collections.sort(studs);
		
		for(Student s : studs) {
			System.out.println(s);
		}
		
		//System.out.println(studs);
	}

}
