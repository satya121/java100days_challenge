public class Pattern21
{
	public static void main(String args[])
	{
		int n=5;
		int number=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int k=1;k<=number;k++)
				System.out.print((k-i)<0?-(k-i):(k-i));
			System.out.println();
			number+=2;
			
		}				
	}
}