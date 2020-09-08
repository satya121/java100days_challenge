import java.util.*;
public class Spy
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num =sc.nextInt();
		int sum=0;
		int pro=1;
		while(num!=0){
			int a=num%10;
			sum=sum+a;
			pro=pro*a;
			num=num/10;
		}
		if (sum==pro)
			System.out.println("number is SPY");
		else
			System.out.println("numebr is not a SPy");
	}
}