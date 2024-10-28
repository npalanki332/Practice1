package ExceptionDemo1;

public class ExceptionDemo3 {

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
		System.out.println("done");
	}

}
