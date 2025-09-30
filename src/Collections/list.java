package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class list {
	public static void main(String[] args) {
/*Collection<Integer> num = new ArrayList<Integer>();
		num.add(45);
		num.add(30);
		num.add(87);
		num.add(29);
		
		for(int n : num) {
			System.out.println(n
		}
		*/
		
		List<Integer> num = new ArrayList<Integer>();
		
		num.add(45);
		num.add(30);
		num.add(87);
		num.add(29);
		
		System.out.println(num.indexOf(3));
		System.out.println(num.get(29));
		
		for(int n : num) {
			System.out.println(n);
		}
		
	}
}
