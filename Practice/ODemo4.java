package Practice;

public class ODemo4 
{
	int x;
	A a1;

	public static void main(String[] args) 
	{
		ODemo4 d1 = new ODemo4();
		try
		{
			System.out.println(d1.x);
			System.out.println(d1.a1);
			System.out.println(d1.a1.i);
		}
		catch (NullPointerException e) 
		{
			System.out.println("NullPointerException is invoking");
			
		}
		finally
		{
			System.out.println("Done");
		}
		
		
	}

}
