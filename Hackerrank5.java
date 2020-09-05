import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            double sum=0;
            double a = in.nextInt();
            double b = in.nextInt();
            double n = in.nextInt();
            sum=sum+a;
            for(double j=0;j<n;j++)
            {
                sum=sum+((Math.pow(2,j))*b);
                int sum1=(int)sum;
                System.out.print(sum1+" ");
                if(j==n-1)
                System.out.println();
            }
        }
        in.close();
    }
}

