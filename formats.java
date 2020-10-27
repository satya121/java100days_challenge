import java.util.Scanner;
public class formats
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int flag=0;
		while(i!=0)
		{
			System.out.print(i +" ");
			if(i==n)
				flag=1;
			if(flag==1)
				i--;
			else
				i++;
		}
	}
}