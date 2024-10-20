import java.util.Scanner;
class Sample{
public static void main(String[] a){
Scanner input=new Scanner(System.in);
System.out.println("Enter the celsius:");
float cel=input.nextFloat();
System.out.println("the fahrenheit for "+cel+" is "+(((cel*9)/5)+32));
}
}
