public class Pattern15
{
	public static void main(String[] args)
	{
		int n=5;
		for(int i=5;i>0;i--)
		{
			for(int j=n-i;j>0;j--)
				System.out.print(" ");
			for(int k=1;k<=i;k++)
				System.out.print(k);
			System.out.println();
		}
	}
}