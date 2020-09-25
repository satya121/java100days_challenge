import java.util.Scanner;
public class Finger_Count{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int a=num%8;
		if( a== 1)
			System.out.println("little finger");
		else if(a==2 || a==0)
			System.out.println("ring finger");
		else if(a==3 || a==7)
			System.out.println("Middle finger");
		else if(a==4 || a==6)
			System.out.println("Fore finger");
		else
			System.out.println("Thumb finger");
	}
}