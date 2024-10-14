//Leetcode -205- Isomorphic strings
//Brute force method
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string-1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter string-2: ");
        String s2 = sc.nextLine();
        boolean result = func(s1, s2);
        System.out.print("Are they isomorphic? "+result);
        sc.close();
    }
    public static boolean func(String s1, String s2){
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0; i<s1.length()-1; i++){
            if(map1[s1.charAt(i)] != map2[s2.charAt(i)]){
                return false;
            }
            map1[s1.charAt(i)] = i+1;
            map2[s2.charAt(i)] = i+1;
        }
        return true;
    }
}
//time comp: O(n) || space comp: O(1)
//Explanation:
// create two arrays to store characters AND COUNT
//   Check if both the string has same length?
//   inside loop take char from boeth string and compare, if equal return true else false and inc the char 

//Optimised method - HashMap

//time comp: O(n) || sapce comp: O(n)
//Opt
