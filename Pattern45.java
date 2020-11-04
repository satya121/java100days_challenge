import java.util.*;
public class Pattern45
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		int y=n;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(2*n);j++)
			{
				if(j>x && j<y)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			x--;
			y++;
		}
	}
}