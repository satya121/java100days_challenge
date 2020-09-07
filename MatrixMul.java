import java.util.*;
class MatrixMul
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the order of the array");
		int n= sc.nextInt();
		int arr[][]=new int[n][n];
		int arr1[][]=new int[n][n];
		System.out.println("enter the elements  of first array");
		int i,j,k;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
		{
			arr[i][j]=sc.nextInt();
		}
		}
		System.out.println("enter the elements of second array");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
		{
			arr1[i][j]=sc.nextInt();
		}
		}
		int arr2[][]=new int[n][n];
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				for(k=0;k<n;k++)
				{
					arr2[i][j]+=arr[i][k]*arr1[k][j];
				}
			}
		}
		System.out.println("The resultant matrix is :");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(arr2[i][j] +" ");
			}
			System.out.println();
		}
	}
}
		