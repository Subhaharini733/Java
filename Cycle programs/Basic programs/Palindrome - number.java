import java.io.*;
import java.util.Scanner;
import java.util.*;
class numpalindrome{
    public static void main (String[] args){
     int r,sum=0,temp,number;
     Scanner sc =new Scanner(System.in);
     System.out.println("enter the  number");
     int s=sc.nextInt();
     number=s;
     while(number!=0)
     {
        r=number%10;
        sum=(sum*10)+r;
        number/=10;
     }
    if( sum==s)
        System.out.println("the given number is palindrome number");
    else
     System.out.println("the given number is  not palindrome number");
     
    }
     }
