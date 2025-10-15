package ExceptionHandling;

class AkashException extends Exception{
	public AkashException(String string) {
		super(string);
	}
}

public class CustomException {

	public static void main(String[] args) {
		int i = 19;
		int j = 0;
		
		try
		{
			j = 18/i;
			if(j==0) 
				throw new AkashException("I don't want to print to zero ");
		}
		catch(AkashException e){
			j = 18/1;
			System.out.println("Thats the default output " + e);
		}
		
		catch(Exception e) {           //Exception is a parent class to handle all the exceptions
			System.out.println("Something went wrong.. "+ e);
		}
		
		System.out.println(j);
		System.out.println("Bye!..");
	}

}
