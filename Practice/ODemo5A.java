package Practice;

public class ODemo5A
{
	int x =1;
	A a1;
	void fun1()
	{
		x = x+1;//3+1 = 4
		a1.i = a1.i +x;// 1+4 = 5
	}

	public static void main(String[] args) 
	{
		ODemo5A d1 = new ODemo5A();
		d1.x = d1.x+2;// 1+2 = 3
		d1.a1 = new A();
		d1.a1.i = d1.a1.i+1;//0+1 =1
		d1.fun1();
		System.out.println(d1.a1.i);
		System.out.println(d1.x);
		
		

	}

}
