//Program for reversal algorithm of Array rotation.
import java.util.*;
public class ArrayRotation
{
	static void reverse(int arr[],int start,int end)
	{
		int temp;
		while(start<end)
		{
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void left_shift(int arr[],int k,int n)
	{	
		reverse(arr,0,k-1);
		reverse(arr,k,n-1);
		reverse(arr,0,n-1);
	}
	static void show(int arr[])
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String args[])
	{
		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the values:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		k=sc.nextInt();
		left_shift(arr,k,n);
		show(arr);
	}
}