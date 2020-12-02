import java.util.*;
public class Pangram
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2="abcdefghijklmnopqrstuvwxyz";
		int count=0;
		int local_count=0;
		for(int i=0;i<str2.length();i++)
		{
			local_count=0;
			for(int j=0;j<str1.length();j++)
			{
				if(str1.charAt(j)==str2.charAt(i))
					local_count++;
			}
			if(local_count>0)
				count++;	
		}
		if(count==26)
			System.out.println("Given number is Pangram");
		else
			System.out.println("Given number is not a Pangram");
	}
}		