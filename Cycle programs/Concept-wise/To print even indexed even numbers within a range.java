import java.util.Scanner;
class Sample{
public static void main(String[] a){
Scanner input=new Scanner(System.in);
System.out.print("Enter range:");
int range=input.nextInt();
for(int i=4;i<=range;i+=4){
System.out.println(i);
}
}
}
