package OOPS;

public class Inheritance {
	static class Animal{
		void sound() {
		System.out.println("Animals makes a sound ");
	}
	}
	
	static class Dog extends Animal {
		void sound() {
			System.out.println("Dogs barks ");
		}
	}
	
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		
	}

}
