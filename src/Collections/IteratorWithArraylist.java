package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWithArraylist {
	public static void main(String[] args) {
		ArrayList<String> Languages = new ArrayList<>();
		Languages.add("Java");
		Languages.add("Python");
		Languages.add("C++");
		Languages.add("Kotlin");
		
		Iterator<String> it = Languages.iterator();
		
		while(it.hasNext()) {                         //hasNext()
			String lang = it.next();                  //next()
			System.out.println(lang);
			
			if(lang.equals("C++")) {
				it.remove();                          //remove()
			}
			
		}
		
		System.out.println("After removal : " + Languages);
	}
}
