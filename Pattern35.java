import java.util.*;
public class Pattern35
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n-1;i>-n;i--)
		{
			int tmp=Math.abs(i);
			for(int j=1;j<=tmp;j++)
				System.out.print(" ");
			for(int k=1;k<=n-tmp;k++)
				System.out.print((n-tmp) +" ");
			System.out.println();
		}				
	}
}