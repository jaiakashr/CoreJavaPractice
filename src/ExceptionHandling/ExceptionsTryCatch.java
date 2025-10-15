package ExceptionHandling;

public class ExceptionsTryCatch {
	public static void main(String[] args) {
		int i = 4;
		int j = 0;
		
		int nums[] = new int[5];
		String str = null;
		
		try
		{
			j = 18/i;
			System.out.println(str.length());
			System.out.println(nums[1]);
			System.out.println(nums[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divided by zero " );
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Stay in your Limit.. " );
		}
		catch(Exception e)           //Exception is a parent class to handle all the exceptions
		{
			System.out.println("Something went wrong.. "+ e);
		}
		
		System.out.println(j);
		System.out.println("Bye!..");
	}
}
