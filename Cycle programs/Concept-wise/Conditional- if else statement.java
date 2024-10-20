import java.util.Scanner;
class Sample{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("value age:");
int age=input.nextInt();
if(age>21){
System.out.println("Eligible for examination!!");
}
else{
System.out.println("not eligible for examination!!");
}
}
}
