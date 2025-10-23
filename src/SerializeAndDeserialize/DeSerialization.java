package SerializeAndDeserialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerialization {
	public static void main(String[] args) {
		try {
            FileInputStream fis = new FileInputStream("student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("✅ Object deserialized successfully!");
            System.out.println("Name: " + s.Name);
            System.out.println("Age: " + s.Age);
            System.out.println("Password: " + s.Password); // null (transient)
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
}
