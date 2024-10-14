//Leetcode -389- Find the difference

//Array based - counting
import java.util.Scanner;
import java.util.HashMap;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string-1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the string-2: ");
        String s2 = sc.nextLine();
        char result = func(s1, s2);
        System.out.print("Difference: "+result);
        sc.close();
    }
    public static char func(String s1, String s2){
       int[] count = new int[256];
       for(char c : s1.toCharArray()){
           count[c]++;
       }
       for(char c : s2.toCharArray()){
           count[c]--;
           if(count[c] < 0){
               return c;
           }
       }
       return '\0';
    }
}
//time comp: O(n+m) || space comp: O(1)


//DSA - HashMap sorting
import java.util.Scanner;
import java.util.HashMap;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string-1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the string-2: ");
        String s2 = sc.nextLine();
        char result = func(s1, s2);
        System.out.print("Difference: "+result);
        sc.close();
    }
    public static char func(String s1, String s2){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c : s2.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
                if(map.get(c) < 0){
                    return c;
                }
            }
            else{
                return c;
            }
        }
        return '\0';
    }
}
//time comp:O(n+m) || space comp: O(1)
// Explanation:
// store s2 string elements as char inside hashmap named map
//     then check if char of s1 string is in hashmap, if present reduce 1 else return that char.
//     then check if that char has element count < 0, if yes return char as it is in s2 but not in s1.
//     if all fails return placeholder value '\0' .
