//Leetcode -344- Reverse string
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }
        String[] result = func(arr);
        System.out.print("The reversed string is [");
        for(int i=0; i<result.length; i++){
            System.out.print(result[i]);
            if(i < result.length-1){
                System.out.print(", ");
            }
        }
        System.out.print(" ]");
        sc.close();
    }
        public static String[] func(String[] arr){
            int l = 0;
            int r = arr.length - 1;
            while(l < r){
                String temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
            return arr;
        }
    }
//time comp:O(n) || space comp:O(n)
