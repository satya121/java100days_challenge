import java.util.Scanner;
public class Rare_Num
{
	public int reverse(int num)
	{
		int rnum=0;
		while(num!=0)
		{
			int rem=num%10;
			rnum=rnum*10+rem;
			num=num/10;
		}
		return rnum;
	}
	public static int perfect_Sqrt(double num)
	{
		double pr = Math.sqrt(num);
		if( pr-Math.floor(pr)==0)
			return 1;
		else
			return 0;
	}	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		Rare_Num obj=new Rare_Num();
		int rnum=obj.reverse(num);
		if(rnum!=num)
		{
			int d_num=num-rnum;
			int a_num=num+rnum;
			if(perfect_Sqrt((double)d_num)==1 && perfect_Sqrt((double)a_num)==1)
				System.out.println("Entered number is rare number");
			else
				System.out.println("Entered number is not a rare number");
		}
	}
}
			