import java.util.Scanner;
public class Sastry_Num
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		String con_num= Integer.toString(num)+Integer.toString(num+1);
		num=Integer.valueOf(con_num);
		double sqr= Math.sqrt(num);
		if(sqr==Math.floor(sqr))
			System.out.println("Sastry number");
		else
			System.out.println("Not sastry number");
	}
}