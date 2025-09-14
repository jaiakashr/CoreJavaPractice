package ControlFlowStatements;

import java.util.Scanner;

public class SwitchStatements {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A value : ");
		int a = scan.nextInt();
		System.out.print("Enter B value : ");
		int b = scan.nextInt();
		
		char operator;
		System.out.println(" Enter any operations such as (+ , - , * , / or %");
		operator = scan.next().charAt(0);
		
		switch (operator) {
		case '+':
			System.out.println("The value of "+ a + "+" + b +" : " +(a+b) );
			break;
			
		case '-':
			System.out.println("The value of "+ a + "-" + b +" : " +(a-b) );
			break;
			
		case '*':
			System.out.println("The value of "+ a + "*" + b +" : " +(a*b) );
			break;
			
		case '/':
			System.out.println("The value of "+ a + "/" + b +" : " +(a/b) );
			break;
			
		case '%':
			System.out.println("The value of "+ a + "%" + b +" : " +(a%b) );
			break;
			
		default:
			System.out.println("Sorry, There is no match any operators to execute ");
		}
		
		
		}
}
