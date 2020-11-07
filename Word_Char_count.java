import java.util.*;
public class Word_Char_count
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		int word_Count=0;
		int char_Count=0;
		char[] ch=str.toCharArray();
		if(str.length()==0)
			System.out.println("please enter a String");
		else {
		String word="";
		for(int i=0;i<ch.length;i++)
		{
			word = "";
			while(i<ch.length && ch[i]!=' ')  {
				word=word+ch[i];
				i++;

			}
			word_Count++;
			System.out.println(word +"=" +word.length());
			char_Count= char_Count+(word.length());	
		}
		System.out.println("Word Count=" +word_Count);
		System.out.println("Char count=" +char_Count);
		}
	}
}