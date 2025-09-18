package Constructor;

public class Student {
	
	String name;
	int marks;
	
	Student(){
		System.out.println("Hello");
	}
	
	Student(String n, int m){                             //parameterized constructor
		name = n;
		marks = m;
	}
	
	void display() {
		System.out.println(name + " - "+marks);
	}

	public static void main(String[] args) {
		
		Student std1 = new Student();                     //default constructor called
		Student std2 = new Student("Akash", 22);          //pass values for parameterized constructor
		
		
		System.out.println(std1.name);
		std2.display();
		
	}

}
