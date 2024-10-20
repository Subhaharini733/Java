package edu.ngp.list;
import java.util.Scanner;  
public class Listreplace {

	public static void main(String[] args) {
		int n;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter the number of elements: ");   
		n=sc.nextInt();  
		int[] array = new int[10];  
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{   
		array[i]=sc.nextInt();  
		} 
		System.out.println("Enter element to be replaced :");
		int m=sc.nextInt();
		System.out.println("Array elements after replacement: ");   
		for (int i=0; i<n; i++)   
		{  
		System.out.println(array[i]=m);  
		}  
		sc.close();
		}  
}
