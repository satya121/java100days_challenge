import java.util.Scanner;
public class Camel_Count
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String str1=sc.next();
	int len=str1.length();
	int count=0;
	//char s;
	if(len==0)
		System.out.println("String is empty");
	else
	{
		for(int i=0;i<len;i++)
		{
			char s = str1.charAt(i);
			if( s>='A' && s<='Z' )
				count++;
		}
	}
	System.out.println("count of camel words=" +count);
	}
}
		