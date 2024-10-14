//Leetcode- 58 -Length of last word

//brute force approach
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        int result = func(s);
        System.out.print("The last word size: "+result);
        sc.close();
    }
    public static int func(String s){
        s = s.trim();
        String[] words = s.split(" ");
        String lastword = words[words.length-1];
        return lastword.length();
    }
}

// Explanation:
//Time comp: O(n) || Space comp: O(n)
// first trim end spaces , then spli string and store it in an array words
// pick last element of the array words and return its length

//Optimised approach
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        int result = func(s);
        System.out.print("The last word size: "+result);
        sc.close();
    }
    public static int func(String s){
        int len = 0;
        int i = s.length()-1;
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' '){
            len++;
            i--;
        }
        return
    }
}

// Explanation:
// Time comp: O(n) || Space comp: O(1)
//   declare i with last element of string
//   if that element is blank space, decrement i to previous position
//   else increment length and then decrement i until theres no value .that is string is 0
