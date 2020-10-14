import java.util.Scanner;
public class Pattern24
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int number=(2*n)-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>1;j--)
				System.out.print(" ");
			for(int k=1;k<=number;k++){
				System.out.print("*");
			}	
			System.out.println();
			number-=2;
		}				
	}
}