package FileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;

class bufferedreader {
	public static void main(String[] args) {		
		try {
			FileReader fr = new FileReader("Output.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			
		while (line != null) {
			System.out.print(line);
			line = br.readLine();
		}
			
		br.close();
		}
		
		catch (	Exception e) {
			System.out.println("File not found");
		}
	}
}
