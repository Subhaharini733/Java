// Leetcode -1- Two_sum
// time comp: O(n^2)
// space comp: O(1)

import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int k = sc.nextInt();
        int[] result = func(arr, n, k);
        System.out.println("Two sum index: " + Arrays.toString(result));
        sc.close();
    }
    static int[] func(int[] arr, int n, int k){
        for (int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if (arr[i]+arr[j] == k){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
