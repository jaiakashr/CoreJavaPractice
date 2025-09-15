
	
package String;

public class Strings {
	
	public static void main(String[] args) {
		
        String name = "  Java Programming  ";

        System.out.println("Length: " + name.length());
        System.out.println("First char: " + name.charAt(0));
        System.out.println("Substring: " + name.substring(2, 6));
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Trimmed: '" + name.trim() + "'");
    }
}
