
// RunTimePolymorphism is also known as Method Overriding.
// A subclass provides its own implementation of a method already defined in the parent class.
// At runtime, Java decides which show() to call, depending on the actual object type.

package OOPS;

class A{
	public void show() {
		System.out.println("in A show ");
	}
	public void config() {
		System.out.println("in A config ");
	}
}

class B extends A{
	public void show() {                               // this subclass overriding the show method from the parent class class A
		System.out.println("in B show ");
	}
	public void config() {
		System.out.println("in B config ");
	}
	
}


public class RunTimePolymorphism {
	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		obj.config();
		
	}
}
