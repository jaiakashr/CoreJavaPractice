package String;

public class StringBufferAndBuilder {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Akash");
		sb.append(" Nandhini");
		sb.deleteCharAt(2);
		sb.insert(2, "a");
		sb.insert(0, "Java ");
		sb.setLength(20);
		sb.ensureCapacity(6);
		
		System.out.println(sb);
	}

}
