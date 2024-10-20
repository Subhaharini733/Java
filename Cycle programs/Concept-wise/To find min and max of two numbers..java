import java.util.Scanner;
class Sample{
public static void main(String[] a){
Scanner input=new Scanner(System.in);
System.out.println("First num:");
int num1=input.nextInt();
System.out.println("Second num:");
int num2=input.nextInt();
System.out.println("the max and min of two numbers are:"+Math.max(num1,num2)+ " and "+Math.min(num1,num2));
}
}
