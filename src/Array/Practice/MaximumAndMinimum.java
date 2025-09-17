package Array.Practice;

public class MaximumAndMinimum {
	
	
	public static void main(String[] args) {
		
		int num[] = {54,89,100,89,99,14};
		int max = num[0];
		int min = num[0];
		
		for(int i=1; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
			if(num[i]<min) {
				min = num[i];
			}
		}
		System.out.println("Maximum number of Array is "+max);
		System.out.println("Minimum number of Array is "+min);
	}
}
