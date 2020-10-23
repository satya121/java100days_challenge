import java.util.*;
public class Pattern31
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
			for(int j=n-1;j>=n-a;j--)
				System.out.print(j +" ");
			System.out.println();
		}
	}
}