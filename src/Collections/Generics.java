package Collections;

class Box<T> {
	private T value;
	
	public void set(T value){
		this.value = value;
	}
	
	public T get() {
		return value;
	}
}

public class Generics {
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();
		intBox.set(30);
		System.out.println(intBox.get());
		
		Box<String> strBox = new Box<>();
		strBox.set("Akassh");
		System.out.println(strBox.get());
		
//		T is a generic type parameter. It's like a placeholder for a data type.
//
//	    When you create a Box<String>, T becomes String.
//	    When you create a Box<Integer>, T becomes Integer.

	}
}
