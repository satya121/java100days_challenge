import java.util.Scanner;
public class Triperfect
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int trinum=3*num;
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				if(i>=num/i)
					break;
				sum=sum+i+(num/i);
			}
		}
		if(trinum==sum)
			System.out.println("Given number is Triperfect");
		else
			System.out.println("Given number is not a Triperfect ");
	}
}