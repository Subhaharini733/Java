// Leetcode - 1143- Longest_Common_Subsequence
// time comp: O(n^2)
// space comp: O(n^2)

 import java.util.Scanner;
 public class Main{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String s1 =  sc.nextLine();
         String s2 = sc.nextLine();
         int result = func(s1, s2);
         System.out.print("Longest subsequence: "+ result);
         sc.close();
     }
     static int func(String s1, String s2){
         int[][] dp = new int[s1.length() + 1][s2.length() + 1];
         for (int i=0; i<s1.length(); i++){
             dp[i][0] = 0;
         }
         for (int j=0; j<s2.length(); j++){
             dp[0][j] = 0;
         }
         for (int i=1; i<=s1.length(); i++){
             for (int j=1; j<=s2.length(); j++){
                 if (s1.charAt(i-1) == s2.charAt(j-1)){
                     dp[i][j] = 1 + dp[i-1][j-1];
                 }
                 else{
                     dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                 }
             }
         }
         return dp[s1.length()][s2.length()];
     }
 }
