import java.util.*;
import java.lang.Math;
public class Disarian{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int digits = (int)Math.log10(num)+1;
		int temp=num;
		int sum=0;
		int rem;
		while(temp!=0){
			rem=temp%10;
			sum=sum+(int)Math.pow(rem,digits);
			temp=temp/10;
			digits--;
		}
		if(sum==num)
			System.out.println("Entered number is Disarian number");
		else
			System.out.println("Entered number is not a Diasarian number");
	}
}
		
		
