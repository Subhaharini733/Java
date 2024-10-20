import java.util.Arrays; 
import java.util.Scanner;
class Arays{
public static void main(String[] a){
int[] arr = new int[5];
Scanner sc=new Scanner(System.in);
for(int i=0; i<arr.length;i++){
System.out.println("Enter array value:");
arr[i]=sc.nextInt();
}
sc.close();
System.out.println("Array length:"+arr.length);
int[] secarr=arr.clone();
String data=Arrays.toString(secarr);
System.out.println(data);
}
}
