package FileInputOutput;

import java.io.FileReader;

public class FileReaderDemo {
	public static void main(String[] args) {
		try {
		FileReader fr = new FileReader("Output.txt");
		int c = fr.read();
		
//		System.out.print((char)c);  //It will print only one character from a file. To print all character/text in a file, we use while loop
//		c = fr.read();
		
		while (c != -1) {               // -1 means end of file
			System.out.print((char)c);
			c = fr.read();
		}
		
		fr.close();
		}
		catch (	Exception e) {
			System.out.println("File not found");
		}
	}
}
