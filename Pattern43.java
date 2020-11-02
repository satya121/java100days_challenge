import java.util.*;
public class Pattern43
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=n; int y=n;
		int flag=1;
		for(int i=n-1;i>=-(n-1);i--)
		{
			if(i<=0){
				flag=0;
			}
			for(int j=1;j<=(2*n)-1;j++)
			{
				if(j==x || j==y)
					System.out.print(Math.abs(i)+1);
				else
					System.out.print(" ");
			}
			if(flag==1){
				x=x+1;
				y=y-1; 
			 }
			else
			{
				x=x-1;
				y=y+1;
			}
			System.out.println();
		}				
	}
}