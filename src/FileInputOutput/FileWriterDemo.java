package FileInputOutput;
//tutorial EMC

import java.io.FileWriter;

public class FileWriterDemo {
	public static void main(String[] args) {
		try {
		FileWriter fw = new FileWriter("output.txt",true); //true is for adding extra new texts in file, if u don't want to remove existing texts
		fw.write("Hello World! ");
		fw.close();
		System.out.println("Success!.. ");
		}
		catch (Exception e) {
			System.out.println("Something wrong ");
		}
	}

}
