package String.Practice;

import java.util.Scanner;

public class PalindromeString {
	
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);

		 // Take input
        System.out.print("Enter a string: ");
        String str = scan.nextLine();

        // Convert to lowercase to ignore case
        str = str.toLowerCase();

        // Reverse the string
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Check palindrome
        if (str.equals(reversed)) {
            System.out.println("✅ Palindrome");
        } else {
            System.out.println("❌ Not a Palindrome");
        }

        scan.close();   
	        
	}
}
