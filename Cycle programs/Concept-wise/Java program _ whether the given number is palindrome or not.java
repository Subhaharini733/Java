import java.util.Scanner;
class Sample{
public static void main(String[] a){
Scanner input=new Scanner(System.in);
System.out.print("Enter number :");
int num=input.nextInt();
int temp=num, sum=0;
while(num>0){
int rem=num%10;
sum=(sum*10)+rem;
num=num/10;
}
if(temp==sum){
System.out.println("It is palindrome");
}
else{
System.out.println("It is not palindrome");
}
}
}
