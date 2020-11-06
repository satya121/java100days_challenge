import java.util.*;
public class Pattern47
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=-(n-1);i<=(n-1);i++)
		{
			for(int j=1;j<(2*n);j++)
			{
				if(j<=(n-Math.abs(i)) || j>=(2*n)-(n-Math.abs(i)))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}