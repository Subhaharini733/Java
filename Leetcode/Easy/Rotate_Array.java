// Leetcode -189- Rotate_Array
// time comp: O(n)
// space comp: O(1)

import java.util.Scanner;
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
        System.out.print("Enter k value: ");
        int k = sc.nextInt();
        func(arr, n, k);
        System.out.println("Rotated Array: ");
        printArray(arr);
        sc.close();
    }
    static void func(int[] arr, int n, int k){
        k = k % n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
    static void reverse(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void printArray(int[] arr){
        for (int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
