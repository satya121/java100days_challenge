class CommandLineArray
{
	public static void main(String args[])
	{
		int arr[]=new int[args.length];
		int count=0;
		for(int i=0;i<args.length;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
			count++;
		}
		System.out.println("The elements in the array are:");
		for(int j=0;j<count;j++)
		{
			System.out.print(arr[j]  +" ");
		}
		System.out.println();
		System.out.println("count of the elements in the array is:" +count);
	}
}