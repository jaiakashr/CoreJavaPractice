package Constructor;

public class Teacher {
	
	String myname;
	
	Teacher(){
		System.out.println("Hello!... ");
	}
	
	void Setname(String myname) {
		this.myname = myname;
	}

	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.Setname("mark");
		System.out.println(t1.myname);
	}
}