import java.util.*;
public class Anagram
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		boolean status;
		if(str1.length()!=str2.length())
			status=false;
		else
		{
			char[] arr1=str1.toLowerCase().toCharArray();
			char[] arr2=str2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			status=Arrays.equals(arr1,arr2);
		}
		if(status)
			System.out.println("Strings are anagrams");
		else
			System.out.println("Strings are not anagrams");
	}
}				