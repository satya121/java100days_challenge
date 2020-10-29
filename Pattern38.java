import java.util.*;
public class Pattern38
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n-1;i>-n;i--)
		{
			int j,tmp=Math.abs(i);
			for(j=1;j<=tmp;j++)
				System.out.print(" ");
			int x=i>0?1:j;
			for(int k=1;k<=n-tmp;k++){
				System.out.print((char)(x+64)+" ");
				x=x+1;
			}
			System.out.println();
		}				
	}
}