import java.util.Scanner;
public class Zukarman_Num
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int pro=1;
		while(temp!=0)
		{
			pro=pro*(temp%10);
			temp=temp/10;
		}
		if(num%pro==0)
			System.out.println("Entered number is Zukarman number");
		else
			System.out.println("Entered number is not a Zukarman number");
	}
}