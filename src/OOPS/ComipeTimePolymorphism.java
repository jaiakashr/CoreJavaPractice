
//Compile time polymorphism is also known as Method overloading
//Same method name, but different parameter lists (number or type of parameters).


package OOPS;

public class ComipeTimePolymorphism {
	
	static class School {
		void display(double d) {
			System.out.println("One");
		}
		
		void display(int a) {
			System.out.println("Two");
		}
	}
	
	
	public static void main(String[] args) {
		School obj = new School();
		obj.display(40);
		obj.display(40.5);
		
	}
}
