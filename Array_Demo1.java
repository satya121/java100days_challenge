import java.util.*;
public class Array_Demo1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int fir_pos=-1,las_pos=-1;
		int arr[] =new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		int num=sc.nextInt();
		int f_count=0;
		int l_count=0;
		for(int i=0;i<a;i++)
		{
			if(arr[i]==num)
			{
				fir_pos=i;
				break;
			}
			else
				f_count++;
		}
		for(int j=a-1;j>=0;j--)
		{
			if(arr[j]==num)
			{
				las_pos=j;
				break;
			}
			else
				l_count++;
		}
		System.out.println("[" +fir_pos +"," +las_pos +"]");

			
	}
}