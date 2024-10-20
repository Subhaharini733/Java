import java.util.Scanner;
class Sample{
public static void main(String[] a){
Scanner input=new Scanner(System.in);
System.out.println("Enter interest:");
float inr=input.nextFloat();
System.out.println("Enter principal amount and years:");
float amt=input.nextFloat();
float yr=input.nextFloat();
System.out.println("The simple interest for the principal and interets :"+((amt*yr*inr)/100));
}
}
