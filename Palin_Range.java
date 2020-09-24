import java.util.Scanner;
public class Palin_Range
{
	public static int is_Palin(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=(sum*10)+(n%10);
			n=n/10;
		}
		return sum;	
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting value");
		int num1=sc.nextInt();
		System.out.println("enter the ending value");
		int num2=sc.nextInt();
		int i;
		System.out.println("The palindromes in the given range");
		for (i=num1; i<=num2; i++)
		{
			int temp=is_Palin(i);
			if(temp==i){
				System.out.print(i +" ");}
			
		}
	}
}