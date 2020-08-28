import java.util.Scanner;
class Bubble
{
	public void bubbleSort(int[] arr,int sze)
	{
		for(int i=0;i<sze;i++)
		{
			for(int j=0;j<sze-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Elements after swapping:");
		
	}
	public void printArray(int[] arr,int sze)
	{
		for(int i=0;i<sze;i++)
			System.out.println(arr[i]);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] array;
		System.out.println("enter array size:");
		int size=sc.nextInt();
		array=new int[size];
		System.out.println("enter the array element:");
		for(int i=0;i<size;i++)
			array[i]=sc.nextInt();
		Bubble obj=new Bubble();
		System.out.println("Elements after sorting:");
		obj.printArray(array,size);
		obj.bubbleSort(array,size);
		obj.printArray(array,size);
	}
}