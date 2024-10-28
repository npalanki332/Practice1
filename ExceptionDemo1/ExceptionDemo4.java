package ExceptionDemo1;

public class ExceptionDemo4 {

	public static void main(String[] args) 
	{
		System.out.println("Main method invoking");
		try
		{
			System.out.println(10/0);
		}
		catch (ArithmeticException a)
		{
			System.out.println("ArithmeticException is invoking");
		}
		try
		{
			int arr[]= {10,20,30,40,50};
			System.out.println(arr[6]);
			
		}
		catch (ArrayIndexOutOfBoundsException b)
		{
			System.out.println("ArrayIndexOutOfBoundsException is invoking");
		}
		System.out.println("done");
	}

}
