package ControlFlowStatements;

import java.util.Scanner;

public class LoopStatements {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter what you want loop : ");
		String loop = scan.nextLine();
		
		System.out.println(" How many times you want to loop : ");
		int num = scan.nextInt();
		int i = 1;
		
		/* for loop
		for(int i = 1; i <= num; i++ ) {
			System.out.println(loop);
		} */
		
		/*while loop
		
		while(i<= num) {
			System.out.println(loop);
			i++;
		} */
		
		/*do while loop*/
		do{
			System.out.println(loop);
			i++;
		}while (i<=num);
		
	}
}
