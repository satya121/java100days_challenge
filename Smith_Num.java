import java.util.*;
public class Smith_Num
{
	public int isprime(int num){
		int count=0;
		for(int i=2;i<num;i++){
			if(num%i==0)
				count++; 
		}
		if(count==0)
			return 1;  	
		else
			return 0;
	}
	public int digit_Sum(int num){
		int sum=0;
		while(num!=0){
			sum=sum+(num%10);
			num=num/10;
		}
		return sum;
	}
	public  static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		Smith_Num obj=new Smith_Num();
		int sum=0;
		if(obj.isprime(num)==0)
		{
			for(int i=2;i<num;i++){
				int temp=i;
				if(num%temp==0){
					System.out.println("internal sum=" +sum);
					while(temp!=0){
						System.out.println("temp=" +temp);
						sum=sum+(temp%10);
						temp=temp/10;
					}
				}
			}
			System.out.println("sum=" +sum +"digit_sum=" +obj.digit_Sum(num));
			if(sum==obj.digit_Sum(num))
				System.out.println("Number is a Smith number");
			else
				System.out.println("Number is not Smith number");
		}
		else
			System.out.println("given number is not Smith number as it is a prime number");
	}
}












