import java.util.*;
public class Pattern39
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n; int y=n;
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=(2*n)-1;j++)
			{
				if(j==x || j==y)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			x=x+1;
			y=y-1;
			System.out.println();
		}				
	}
}