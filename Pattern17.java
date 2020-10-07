public class Pattern17
{
	public static void main(String args[])
	{
		int n=5;
		int stars=1;
		for(int i=5;i>0;i--)
		{
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int k=stars;k>0;k--)
				System.out.print("*");
			System.out.println();
			stars+=1;
		}				
	}
}