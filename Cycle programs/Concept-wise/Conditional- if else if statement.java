import java.util.Scanner;
class Sample{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("value m1:");
int m1=input.nextInt();
System.out.println("value m2:");
int m2=input.nextInt();
System.out.println("value m3:");
int m3=input.nextInt();
if(m1>m2){
if(m1>m3){
System.out.println("Allocate to m1");
}
else{
System.out.println("Allocate to m2");
}
}
else if(m2>m3){
System.out.println("Allocate to m2");
}
else{
System.out.println("Allocate to m3");
}
}
}
