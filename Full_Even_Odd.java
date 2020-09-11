import java.util.*;
class Full_Even_Odd{
	public int is_Even(int num){
	int count=0;
	int temp;
	while(num!=0){
		temp=num%10;
		if(temp%2==0){
			 num=num/10; 
			count++;
			
		 }
		else
		{
			 //return count;
			break;
		}
		
		}
		return count;
	}
	public int is_Odd(int num){
	int count=0;
	int temp;
	while(num!=0){
		temp=num%10;
		if(temp%2!=0){
			num=num/10; 
			count++;
		 }
		else
		{
			//return count;
			break;
		}
		
		}
		return count;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Full_Even_Odd obj=new Full_Even_Odd();
		System.out.println("Enter a number:");
		int num= sc.nextInt();
		int l_Digit =num%10;
		int digits = (int)Math.log10(num)+1;
		System.out.println("digits=" +digits +"l_Digit=" +l_Digit);
		if(l_Digit %2==0){
			int count=obj.is_Even(num);
			if(count==digits){ System.out.println("Entered number are Even"); }
		}
		{
			int count=obj.is_Odd(num);
			if(count==digits){ System.out.println("Entered digits are Odd"); }
		}
	}
}