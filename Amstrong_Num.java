import java.util.Scanner;
public class Amstrong_Num
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			sum=sum+(int)Math.pow((temp%10),3);
			temp=temp/10;
		}
		if(sum==num)
			System.out.println("Entered number is Amstrong number");
		else
			System.out.println("Entered number is not a Amstrong number");
	}
}