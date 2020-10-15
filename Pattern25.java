import java.util.Scanner;
public class Pattern25
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int number=(2*n)-1;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int k=1;k<=number;k++){
				System.out.print(k);
			}	
			System.out.println();
			number-=2;
		}				
	}
}