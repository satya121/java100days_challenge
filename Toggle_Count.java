import java.util.*;
public class Toggle_Count
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String words[] =str1.split("\\s");
		String first,rem,toggle="";
		for(String w: words)
		{
			first=w.substring(0,1);
			rem=w.substring(1);
			toggle=toggle+first.toLowerCase()+rem.toUpperCase()+" ";
		}
		System.out.println(toggle);
	}
}	