import java.util.Scanner;
class Sample{
public static void main(String[] a){
Scanner input=new Scanner(System.in);
System.out.print("Enter gender(0-male,1-female) :");
int gen=input.nextInt();
System.out.print("Enter age :");
int age=input.nextInt();
if(gen==0){
if(age>=21){
System.out.println("Eligible to marry");
}
else{
System.out.println("Not eligible to marry");
}
}
else if(gen==1){
if(age>=18){
System.out.println("Eligible to marry");
}
else{
System.out.println("Not eligible to marry");
}
}
else{
System.out.println("Invalid gender details");
}
}
}
