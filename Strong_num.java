import java.util.*;
public class Strong_num{
	public int fact(int a){
		int f=1;
		for(int i=1;i<=a;i++){
		f=f*i;
		}
		return f;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Strong_num obj=new Strong_num();
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(temp!=0){
		int a=temp%10;
		temp=temp/10;
		sum=sum+obj.fact(a);
		}
		if(sum==num)
			System.out.println("its a Strong number");
		else
			System.out.println("its not a Strong number");
	}
}