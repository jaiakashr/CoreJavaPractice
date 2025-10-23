package SerializeAndDeserialize;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	String Name;
	int Age;
	transient String Password;
	
	Student(String Name, int Age, String Password){
		this.Name = Name;
		this.Age = Age;
		this.Password = Password;
	}
}

public class serializtion {
	public static void main(String[] args) {
		try {
			Student stud1 = new Student("Akash", 22, "akash2203");
			
			FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(stud1);
            oos.close();
            fos.close();

            System.out.println("✅ Object serialized successfully!");
		}
		catch(IOException e) {
			System.out.println("Error: " + e);
		}
	}
}
