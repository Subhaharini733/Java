import java.util.Scanner;
class Sample{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("value a:");
int a=input.nextInt();
System.out.println("value b:");
int b=input.nextInt();
System.out.println("Arithmetic op (+,-) : "+(a+b)+ " and " +(a-b));
System.out.println("Relational op : "+(a>b)); 
System.out.println("Bitwise (^) : "+(a ^ b));
System.out.println("Assignment op (+=):" +(a+=a));
}
}
