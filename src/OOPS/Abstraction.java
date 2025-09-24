package OOPS;

abstract class car{
	public abstract void drive();
	public void playmusic() {
		System.out.println("Play music!..");
	}
}

class jaguar extends car{
	public void drive() {
		System.out.println("Jaguar is luxury car to drive.");
	}
}

class Nissan extends car{
	public void drive() {
		System.out.println("Nizzan is one of the good car to drive, not much costly.");
	}
	
	
}
public class Abstraction {
	public static void main(String[] args) {
		//car obj = new car(); you can't able to create object for abstract class. 
		car obj = new jaguar();
		car obj1 = new Nissan();
		obj.drive();
		obj.playmusic();
		obj1.drive();
	}
}
