package ExceptionDemo1;

public class ExceptionDemo5 {

	public static void main(String[] args) 
	{
		System.out.println("Main method invoking");
		try
		{
			System.out.println(10/0);
			int arr[]= {10,20,30,40,50};
			System.out.println(arr[5]);
		}
		catch (ArrayIndexOutOfBoundsException b)
		{
			System.out.println("ArrayIndexOutOfBoundsException is invoking");
		}
		catch (ArithmeticException a)
		{
			System.out.println("ArithmeticException is invoking");
		}
		
		System.out.println("done");
	}

}
