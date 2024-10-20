import java.util.Scanner;
class Sample{
public static void main(String[] a){
Scanner input=new Scanner(System.in);
System.out.print("Enter range n :");
int range=input.nextInt();
int sum=0;
for(int i=1; i<=range;i+=2){
System.out.println(i);
sum+=i;
}
System.out.print("sum of odd numbers:"+sum);
}
}
