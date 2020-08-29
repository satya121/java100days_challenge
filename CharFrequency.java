import java.util.Scanner;
class CharFrequency
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String str=sc.next();
	//System.out.println("Enter a character");
	char ch;
	for(int j=0;j<str.length();j++)
	{
	int frequency=0;
	ch=str.charAt(j);
	for(int i=0;i<str.length();i++)
	{	
		if(ch == str. charAt(i))
		{
			frequency++;
		}
	}
	System.out.println("the frequency  of the given " +ch +" is:" +frequency);
	}
	}
}