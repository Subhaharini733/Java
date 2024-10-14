//Leetcode -387- First_Unique_Character_in_string

//Brute-force approach - counting array
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        int result = func(s);
        System.out.print("First unique character: "+result);
        sc.close();
    }
    public static int func(String s){
        int[] count = new int[256];
        for(char c : s.toCharArray()){
            count[c]++;
        }
        for(int i=0; i<s.length(); i++){
            if(count[s.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }
}
//time comp:O(n) || space comp:O(1)

//DSA approach - HashMap
import java.util.Scanner;
import java.util.HashMap;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        int result = func(s);
        System.out.print("First unique character: "+result);
        sc.close();
    }
    public static int func(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}

//time comp:O(n) || space comp:O(n)
// Explanation:
// create hashmap to count occurrence
//   i hashmap map every char to their index and add 1 when occur
//   then check for first occurrence that is occurred only once with if condition
//   return i if present else return -1.
