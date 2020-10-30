import java.util.*;
public class Pattern40
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=1; int y=(2*n)-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(2*n)-1;j++)
			{
				if(j==x || j==y)
					System.out.print(i);
				else
					System.out.print(" ");
			}
			x=x+1;
			y=y-1;
			System.out.println();
		}				
	}
}