import java.util.Scanner;
public class Duffinian_Num
{
	public static int relative_Prime(int n1, int n2)
	{
		int gcd=1;
		for(int i=1; i<=n1 && i<=n2 ;i++)
		{
			if(n1%i==0 && n2%i==0)
				gcd=i;
		}
		return gcd;
	}
	public static int sum_Divi(int n)
	{
		int sum=0;
		for (int i=1; i<n;i++)
		{
			if(n%i==0){
				if(i>=(n/i))
					break;
				else
					sum=sum+i+(n/i);
				}
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num1=sc.nextInt();
		int num2=sum_Divi(num1);
		if(relative_Prime(num1,num2)==1)
			System.out.println("Duffinian number");
		else
			System.out.println("not a duffinian number");
	}
}		