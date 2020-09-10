import java.util.*;
public class Neon
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int sq_num=num*num;
		int temp=sq_num;
		int sum=0;
		while(temp!=0)
		{
			sum=sum+temp%10;
			temp=temp/10;
		}
		System.out.println(sum);
		if(sum==num)
			System.out.println("Given number is neon number");
		else
			System.out.println("Given number is not noen number");
	}
}
		