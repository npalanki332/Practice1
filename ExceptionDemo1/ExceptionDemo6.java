package ExceptionDemo1;

public class ExceptionDemo6 
{
	private static A a1;

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("main Method is invoking");
			int arr[] = {10,20,30,40,50};
			System.out.println(arr[4]);
			System.out.println(ExceptionDemo6.a1.i);			
		}
		catch (NullPointerException n1)
		{
			System.out.println("NullPointerException is invoking");
		}
		catch (Exception c1)
		{
			System.out.println("Exception is invoking");
		}
		catch(Throwable e1)
		{
			System.out.println("throwable is invoking");
		}
		finally
		{
			System.out.println("Quit");
		}
	}
	

}
