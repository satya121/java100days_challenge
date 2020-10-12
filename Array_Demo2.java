import java.util.*;
public class Array_Demo2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		int a=sc.nextInt();
		int count=0;
		for(int j=0;j<num;j++)
		{
			if(arr[j]==a)
				count++;
		}
		System.out.println(num-count);
	}
}