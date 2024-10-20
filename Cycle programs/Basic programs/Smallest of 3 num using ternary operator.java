import java.io.*;
import java.util.Scanner;
import java.util.*;
class smallest{
    public static void main (String[] args){
     Scanner sc =new Scanner(System.in);
     System.out.println("enter number");
     int a=sc.nextInt();
      System.out.println("enter number");
     int b=sc.nextInt();
      System.out.println("enter number");
     int c=sc.nextInt();
     int temp=a<b?a:b;
     int smallest=c<temp?c:temp;
     System.out.println("the smallest of 3 numbers is"+smallest);}
}
     
