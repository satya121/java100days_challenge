import java.util.*;
import java.lang.Math;
public class Automorphic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int sq_num=num*num;
		int digits = (int)Math.log10(num)+1;
		int a=(int)Math.pow(10,digits);
		if(num==sq_num%a)
			System.out.println("Given number is Automorphhic number");
		else
			System.out.println("Given number is not an automorphic number");
	}
}