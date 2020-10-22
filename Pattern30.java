import java.util.*;
public class Pattern30
{
	public static void main(String args[])
	{
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int num=(n*2)-1;
		int a=0;
		for(int i=1;i<=num;i++)
		{
			a=(i<=n)?(i):(a-1);
			for(int j=a;j<n;j++)
				System.out.print(" ");
			for(int j=n-a;j<n;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}