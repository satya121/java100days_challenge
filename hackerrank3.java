import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int a=s1.length();
                //Complete this line
                int count=0;
    int b=x;
                while(b!=0)
    {
                        b=b/10;
        //System.out.println(b);
                        count++;
        //System.out.println(count);
    }
    //System.out.println("a=" +a);
                int c=16-(a+1);
    //System.out.println("c=" +c);
                String sp=" ";
    String str="";
                for(int j=0;j<c;j++)
                {
                    str=str+sp;
                }
    //System.out.println(str.length() +"str length");
                if(count==2)
                {
                    System.out.print(s1);
                    System.out.print(str +"0");
                    System.out.println(x);
                }
                else if(count==0)
                {
                   System.out.print(s1);
                    System.out.print(str +"00");
                    System.out.println(x); 
                }
                else
                {
                    System.out.print(s1);
                    System.out.print(str);
                    System.out.println(x);
                }
            }
            System.out.println("================================");

    }
}
    
