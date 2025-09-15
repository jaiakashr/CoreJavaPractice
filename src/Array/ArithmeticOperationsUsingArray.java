package Array;

import java.util.Scanner;

public class ArithmeticOperationsUsingArray {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[]= new int[5];
		
		System.out.println("Enter the first number : ");
		num[0] = scan.nextInt();
		
		System.out.println("Enter the second number : ");
		num[1] = scan.nextInt();
		
		System.out.println("Enter the third number : ");
		num[2] = scan.nextInt();
		
		System.out.println("Enter the fourth number : ");
		num[3] = scan.nextInt();
		
		System.out.println("Enter the fifth number : ");
		num[4] = scan.nextInt();
		
		int sum = num[0]+num[1]+num[2]+num[3]+num[4];
		int sub = num[0]-num[1]-num[2]-num[3]-num[4];
		int mul = num[0]*num[1]*num[2]*num[3]*num[4];
		int div = num[0]/num[1]/num[2]/num[3]/num[4];
		int mod = num[0]%num[1]%num[2]%num[3]%num[4];
		
		System.out.println("Choose any operations +, -, *, /, or % : ");
		char operators = scan.next().charAt(0);
		
		switch (operators) {
		case '+':
			System.out.println("Addition of all number is : " + sum);
			break;
			
		case '-':
			System.out.println("Subtraction of all number is : " + sub);
			break;
			
		case '*':
			System.out.println("Multiplication of all number is : " + mul);
			break;
			
		case '/':
			System.out.println("Divition of all number is : " + div);
			break;
			
		case '%':
			System.out.println("Modulus of all number is : " + mod);
			break;
			
			default:
				System.out.println("You entered a wrong operator symbol");
		}
	}
}
