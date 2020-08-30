import java.util.Scanner;
class ComplexN
{
	int real,image;
	public void input(int a)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter " +a +" real and imaginary numbers");
		real=s.nextInt();
		image=s.nextInt();	
	}
	/*public ComplexN add()
	{
		ComplexN temp=new ComplexN();
		temp.real=temp.real+real;
		temp.image=temp.image+image;
		return temp;
		
	}*/
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of complex numbers");
		int num=sc.nextInt();
		ComplexN obj[]=new ComplexN[num];
		System.out.println("enter the values");
		for(int i=0;i<num;i++)
		{
			obj[i]=new ComplexN();
			obj[i].input(i+1);
		}
		ComplexN obj1=new ComplexN();
		ComplexN obj2=new ComplexN();
		//ComplexN obj2=new ComplexN();
		for(int j=0;j<num;j++)
		{
			//obj1=obj[j].add();
			obj2.real=obj2.real+obj[j].real;
			obj2.image=obj2.image+obj[j].image;
		}
		System.out.println("the sum of given complex numbers is " +obj2.real +"+" +obj2.image +"i");
	}
}
		