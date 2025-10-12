package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorWithhashSet {
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(50);
		numbers.add(60);
		
		var it = numbers.iterator();   // var makes the iterator declaration shorter, but the actual type is still Iterator<String>. 

	        while (it.hasNext()) {
	            int num = it.next();
	            System.out.println(num);
	        }
	}

}
