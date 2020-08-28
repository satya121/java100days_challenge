import java.util.Scanner;
class Demo
{
	int a,b;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		a=sc.nextInt();
		System.out.println("enter b value");
		b=sc.nextInt();
	}
	public void show()
	{
		System.out.println("A=" +a);
		System.out.println("B=" +b);
	}
}
class ADemo
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.of objects:");
		int num=s.nextInt();
		Demo obj[]=new Demo[num];
		System.out.println("Enter the values:");
		for(int i=0;i<obj.length;i++)
		{
			obj[i]=new Demo();
			obj[i].input();
		}
		System.out.println("the values are:");
		for(int i=0;i<obj.length;i++)
		{
			obj[i].show();
		}
	}
}