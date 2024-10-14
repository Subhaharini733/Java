//Leeetcode 28 - Find the index of the first occurrence
// brute force approach

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter haystack string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter needle: ");
        String s2= sc.nextLine();
        int result = func(s1, s2);
        System.out.print("First occurrence: "+result);
        sc.close();
    }
    public static int func(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 < n2){
            return -1;
        }
        for(int i=0; i<n1-n2; i++){
            int j;
            for(j=0; j<n2; j++){
                if(s1.charAt(i+j) != s2.charAt(j)){
                    break;
                }
            }
            if(j == n2){
                return i;
            }
        }
        return -1;
    }
}

// Explanation:
//Time comp: O(n1*n2)  ||  Space comp: O(n1+n2)
// first check if haystack is less than needle?
//   then check for similarity by iterating s1.charAt(i+j) with s2.charAt(j), if tru proceed else break
//   (in loop (n1-n2) used to check that when i is in index, the remaining would comprise the needle length  and char(i+j) is checked with charAt(j) to find similarity from the current position )
//   then check if the j incremented equals needle length, if yes return i- index value
//   else return -1.

//Optimised approach

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter haystack string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter needle: ");
        String s2= sc.nextLine();
        int result = func(s1, s2);
        System.out.print("First occurrence: "+result);
        sc.close();
    }
    public static int func(String s1, String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 < n2){
            return -1;
        }
        for(int i=0; i<=n1-n2; i++){
            if(s1.substring(i, i+n2).equals(s2)){
                return i;
            }
        }
        return -1;
    }
}

// Explanation:
//Time comp: O(n1*n2)  ||  Space comp: O(n1+n2)
// here inside a for loop, haystack is substring to needle length and check for similarity using .equals with needle
//   if yes return i else return -1.
