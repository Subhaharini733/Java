import java.util.Scanner;
class Sample{
public static void main(String[] a){
Scanner input=new Scanner(System.in);
int sum=0;
for(int i=1;i<=6;i++){
int sub=input.nextInt();
sum+=sub;
System.out.print("sum="+sum);
}
float avg=sum/6;
System.out.println("average="+avg);
}
}
