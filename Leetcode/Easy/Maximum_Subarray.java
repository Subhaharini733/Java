// Leetcode -53- Maximum Subarray
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
        int result = func(arr, n);
        System.out.print("Sum: "+result);
        sc.close();
    }
    static int func(int[] arr, int n){
        int curr = arr[0];
        int sum = arr[0];
        for (int i=1; i<n; i++){
            curr = Math.max(arr[i], (curr + arr[i]));
            if (curr > sum){
                sum = curr;
            }
        }
        return sum;
    }
}
