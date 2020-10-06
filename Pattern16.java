public class Pattern16
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=n;i>0;i--)
		{
			for(int j=n-i;j>0;j--)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print((char)(i+64));
			System.out.println();
		}
	}
}