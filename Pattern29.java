import java.util.*;
public class Pattern29
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
			for(int j=n-a;j<n;j++)
				System.out.print((char)(j+65) +"");
			System.out.println();
		}
	}
}