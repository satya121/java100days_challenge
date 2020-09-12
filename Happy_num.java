import  java.util.*;
public class Happy_num
{
	public int square_sum(int n)
	{
		int sum=0;
		int temp=n;
		while(temp!=0){
		sum=sum+(temp%10)*(temp%10);
		temp=temp/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Happy_num obj=new Happy_num();
		System.out.println("Enter a number");
		int num= sc.nextInt();
		int temp=num;
		while (num!=1 && num!=4) {
			num=obj.square_sum(num);
		}
		if(num==1)
			System.out.println("Entered number is a Happy number");
		else
			System.out.println("Entered number is not a Happy number");
	}
}
		
		