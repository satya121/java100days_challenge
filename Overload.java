import java.util.Scanner;
class Overload
{
	public void m1()
	{
		System.out.println("inside void method");
	}
	private void m1(int a)
	{
		a=20;
		System.out.println("a="+a);
	}
	public static void main(String args[])
	{
		Overload obj=new Overload();
		obj.m1();
		int a=10;
		obj.m1(a);
		
	}
}
	