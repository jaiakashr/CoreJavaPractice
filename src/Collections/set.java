package Collections;

//mport java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class set {
	public static void main(String[] args) {
		Set<Integer> num = new TreeSet<Integer>();
//		Set<Integer> num = new HashSet<Integer>();

		
		num.add(45);
		num.add(30);
		num.add(87);
		num.add(29);
		num.add(30);
		
	    Iterator<Integer> values = num.iterator();
		
	    
	    while(values.hasNext()) 
	    System.out.println(values.next());
		
//		for(int n : num) {
//			System.out.println(n);
//		}
	}

}
