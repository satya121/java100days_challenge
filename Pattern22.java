public class Pattern22
{
	public static void main(String args[])
	{
		int n=5;
		int number=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int k=1;k<=number;k++){
				int a=(k-i)>0?(k-i):(-(k-i)); 
				System.out.print((char)(a+65));
			}	
			System.out.println();
			number+=2;
		}				
	}
}