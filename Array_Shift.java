import java.util.Scanner;
public class Array_Shift
{
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int n,k,t;
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		k=sc.nextInt();
		for(int i=0;i<k;i++)
		{
			t=arr[0];
			for(int j=0;j<n-1;j++)
				arr[j]=arr[j+1];
			arr[n-1]=t;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i] +",");
	}
}