import java.util.Arrays; 
import java.util.Scanner;
class Arays{
public static void main(String[] a){
Scanner sc=new Scanner(System.in); 
int rows=2,cols=2;
int[][] input=new int[rows][cols];
System.out.print(input.length);
for (int i=0;i<rows;i++){
for(int j=0;j<cols;j++){
System.out.print("Enter input ["+i+"]["+j+"]:");
input[i][j]=sc.nextInt();
}
}
sc.close();
}
