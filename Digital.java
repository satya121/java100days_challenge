import java.util.Scanner;
public class Digital{
public static int digitalRoot(int n)
{
    while(n>=10)
    {
       int sum=0;
        while(n!=0){
            sum=sum+(n%10);
            n=n/10;
        }
        n=sum;
        System.out.println("n=" +n);
    }
    return n;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(digitalRoot(n));
}
}