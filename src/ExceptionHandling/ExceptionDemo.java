package ExceptionHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.Exception;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a=10; //b=0;
		int b=0;
		int c = 0;
		
		try {
			//int arr[] = null;
			//System.out.println(arr[1]);
			c = a/b;	
		}
		catch(ArithmeticException | NullPointerException e) {
			System.out.println("Exception has Occured");
		}
//		catch(NullPointerException e) {
//			System.out.println("NullPointer Exception Occured");
//		}
		catch(Exception e) {
			System.out.println("Error Occured!...");
		}
		finally{
			System.out.println("All Errors Checked!!!.. ");
		}
		
		File file = new File("abc.txt");
		try {
			FileInputStream fs = new FileInputStream(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace(); //printStackTrace() is used for show error details but its not stop program. its show error and move to next line
		}
		System.out.println(c);
		
		try (Scanner scan = new Scanner(System.in)) {
			int i = scan.nextInt();
			System.out.println(i);
		}
	}

}
