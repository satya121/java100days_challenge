public class Pattern20
{
	public static void main(String args[])
	{
		int n=1;
		int number=1;
		for(int i=5;i>0;i--)
		{
			for(int j=1;j<i;j++)
				System.out.print(" ");
			for(int k=number;k>=1;k--)
				System.out.print((char)(k+64));
			System.out.println();
			n+=1;
			number+=2;
		}				
	}
}