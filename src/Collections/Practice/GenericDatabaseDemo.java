package Collections.Practice;

import java.util.ArrayList;
import java.util.List;

class Database<T> {
	private List<T> records = new ArrayList<>();

	public void AddRecords(T record){
		records.add(record);
		System.out.println(record + " added to database.");
	}
	
	public void RemoveRecords(T record) {
		if(records.remove(record)) {
			System.out.println(record + " removed from Database.");
		}else {
			System.out.println(record + " not found.");
		}
	}
	
	public void AllRecords() {
		System.out.println("----All Records----");
		for (T record : records) {
			System.out.println(record);
		}
	}
}

class Student{
	private String Name;
	private int RollNo;
	
	public Student(String Name, int RollNo) {
		this.Name = Name;
		this.RollNo = RollNo;
	}
	
	public String toString() {
		return "Student(Name= '" + Name + "', RollNo = " + RollNo+ ")";
	}
	
}

class Employee{
	private String Name;
	private int Salary;
	
	public Employee(String Name, int Salary) {
		this.Name = Name;
		this.Salary = Salary;
	}
	
	public String toString() {
		return "Employee(Name= '" + Name + "', Salary = " + Salary+ ")";
	}
}

public class GenericDatabaseDemo {
	public static  void main(String[] args) {
		 // Create a Student Database
        Database<Student> studentDB = new Database<>();
        studentDB.AddRecords(new Student("Akash", 101));
        studentDB.AddRecords(new Student("Meena", 102));
        studentDB.AllRecords();

        // Create an Employee Database
        Database<Employee> employeeDB = new Database<>();
        employeeDB.AddRecords(new Employee("John", 55000));
        employeeDB.AddRecords(new Employee("Sara", 60000));
        employeeDB.AllRecords();

        // Try to remove a record
        employeeDB.RemoveRecords(new Employee("John", 55000)); 
		
		
	}
}








