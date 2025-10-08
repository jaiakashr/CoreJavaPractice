package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
	public static void main(String[] args) {
		
		Map<String, Integer> Cousins = new HashMap<>();
		//Map<String, Integer> Cousins = new TreeMap<>();
		
		Cousins.put("Akash", 22);
		Cousins.put("Nandhini", 3);
		Cousins.put("Girija", 10);
		Cousins.put("Shneha", 12);
		Cousins.put("Shneha", 20);

		
		System.out.println(Cousins);
		
		System.out.println(Cousins.keySet());
		
		for (String key : Cousins.keySet())
		{
			System.out.println(key + ":" + Cousins.get(key));
		}
	}

}
