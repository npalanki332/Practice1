package Practice;

public class ODemo2 
{

	int x,y;
	void fun1()
	{
		x=x+1;
		ODemo2 d1 = new ODemo2();
		d1.x = x+2;
	}
	public static void main(String[] args)
	{
		ODemo2 d1 = new ODemo2();
		d1.fun1();
		System.out.println(d1.x);
		
	}

}
