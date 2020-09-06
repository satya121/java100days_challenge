import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ab=sc.nextLine();
        int a=0;
        try{
        while(ab!=null){
            System.out.printf("%d %s\n",++a,ab);
            ab=sc.nextLine();
        }
        }
        catch(Exception e){
            
        }
        sc.close();
    }
}
