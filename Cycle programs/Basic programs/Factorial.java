import java.io.*;
import java.util.Scanner;
public class Factorial {
    public static void main (String[] args){
        int i,fact=1;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=in.nextInt();
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}

