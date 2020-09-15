import java.util.*;
public class Kaprekar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sq_num=num*num;
		int temp=sq_num;
		int a,b;
		int flag=0;
		int digits=(int)Math.log10(num)+1;
		int num1=(int)Math.pow(10,digits);
		while(num1!=0)
		{
			a=temp%num1;
			b=temp/num1;
			if(a!=0  && b!=0){
				int sum=a+b;
				if(sum==num){
					flag=1;
					break;}
			}
			num1=num1/10;
		}
		if(flag==1)
			System.out.println("Kaprekar number");
		else
			System.out.println("not a Kaprekar number");
	}
}