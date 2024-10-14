//Leetcode -392- Is Subsequence
//Two - pointer approach
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string-1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string-2: ");
        String s2 = sc.nextLine();
        boolean result = func(s1, s2);
        System.out.print("Is subsequence? "+result);
        sc.close();
    }
    static boolean func(String s1, String s2){
        int s1in = 0;
        int s2in = 0;
        while(s1in < s1.length() && s2in < s2.length()){
            if(s1.charAt(s1in) ==s2.charAt(s2in)){
                s1in++;
            }
            s2in++;
        }
        return s1in == s1.length();
    }
}
//time comp: O(n+m) || space comp: O(1)
// Explanation:
// first set pointers at s and t at zeroth positions
//     then check for equivalence, if yes increment s_index followed by t_index
//     else increment only t_index
//     return true if the s_index == s.length()
