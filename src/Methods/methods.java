package Methods;

import java.util.Scanner;

public class methods {
	
	/*
	static int boxvolume (int length, int breadth, int height){       //method definition
	    return length*breadth*height;
	}*/
	
	static int boxvolume (int length, int breadth, int height){       //method definition
		int volume = length*breadth*height;               
		return volume;
	}
	
	static void printline() {
		System.out.println("--------------------------------");
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter length value to find volume of box : ");
		int a = scan.nextInt();
		
		System.out.println(" Enter breadth value to find volume of box : ");
		int b = scan.nextInt();
		
		System.out.println(" Enter height value to find volume of box : ");
		int c = scan.nextInt();
		
		int volume = boxvolume(a,b,c);   //passing arguments
		
		printline();
		System.out.println(" Volume of the box is : "+volume);
		printline();
	}

}
