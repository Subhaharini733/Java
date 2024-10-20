import java.util.Arrays; 
import java.util.Scanner;
class Arays{
public static void main(String[] a){
int[] arr = new int[5];
Scanner sc=new Scanner(System.in);
for(int i=0; i<arr.length;i++){
System.out.print("Enter array value:");
arr[i]=sc.nextInt();
}
int[] secarr=arr.clone();
String data=Arrays.toString(secarr);
System.out.print(data);
System.out.println("\n Enter number to search: ");
int num = sc.nextInt();
boolean isFound=false;
int index=0;
for(int i=0; i<arr.length; i++){
if(arr[i]==num){
isFound=true;
index=i;
break;
}
}
if(isFound){
System.out.println("Found the number at index :"+index);
}
else{
System.out.println("Not Found");
}
sc.close();

}
}
