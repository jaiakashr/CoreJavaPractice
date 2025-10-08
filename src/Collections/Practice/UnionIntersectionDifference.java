package Collections.Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionDifference {
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(5,6,7,8,9,10));
		
		Set<Integer> Union = new HashSet<>(set1);
		Union.addAll(set2);
		System.out.println("Union : " + Union);
		
		Set<Integer> Interaction = new HashSet<>(set1);
		Interaction.retainAll(set2);
		System.out.println("Interaction : " + Interaction);
		
		Set<Integer> Difference = new HashSet<>(set1);
		Difference.removeAll(set2);
		System.out.println("Differnce : " + Difference);
		

	}

}
