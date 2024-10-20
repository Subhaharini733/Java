import java.io.*;
import java.util.Scanner;
import java.util.*;
public class Reversenum{
    public static void main (String[] args){
     int rem,rev=0,temp,num;
     Scanner sc =new Scanner(System.in);
     System.out.println("enter the  number");
     int s=sc.nextInt();
     num=s;
     while(num!=0)
     {
        rem=num%10;
        rev=(rev*10)+rem;
        num=num/10;
     }
        System.out.println("the reversal is "+rev);
    
     
    }
     }
    
