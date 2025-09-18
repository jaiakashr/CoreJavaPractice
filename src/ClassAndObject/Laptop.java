package ClassAndObject;

public class Laptop {
	
	String name = "";
	String proc = "";
	int RAM = 0;
	int price = 0;
	
	public static void main(String[] args) {
		
		Laptop laptop1 = new Laptop();
		laptop1.name = "Lenovo";
		laptop1.proc = "i5";
		laptop1.RAM = 8;
		laptop1.price = 54000;
		
		Laptop laptop2 = new Laptop();
		laptop2.name = "HP";
		laptop2.proc = "i5";
		laptop2.RAM = 6;
		laptop2.price = 40000;
		
		System.out.println(laptop2.RAM);
		
		Laptop laptop3 = new Laptop();
		laptop3.name = "Dell";
		laptop3.proc = "i4";
		laptop3.RAM = 4;
		laptop3.price = 25000;
	}
}
