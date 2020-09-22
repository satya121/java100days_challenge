import java.util.Scanner;
public class Num_Rotation
{
	public static void print(int num,int digi)
	{
		int n=(int)Math.pow(10,digi);
		for(int i=0;i<digi;i++)
		{
			int f_num=num/n;
			int r_num=((num%n)*10)+(f_num);
			num=r_num;
			System.out.println(num);
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int digits=(int)Math.log10(num);
		print(num,digits);
	}
}