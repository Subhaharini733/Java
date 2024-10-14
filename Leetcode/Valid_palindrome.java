//Leetcode -125- Valid palindrome

//Using stringbuilder
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        boolean result = func(s);
        System.out.print("Is it palindrome? "+result);
        sc.close();
    }
    public static boolean func(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuilder temp = new StringBuilder(s);
        String rev = temp.reverse().toString();
        return s.equals(rev);
    }
}
//time comp: O(n) || space comp: O(n)
// Explanation:
// convert all elements in string to lower and remove non alphanumeric with methods.
//   then using stringBuilder reverse the string s and convert to string using reverse() amd toString()
//   then check for equalance


//using manual looping 
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        boolean result = func(s);
        System.out.print("Is it palindrome? "+result);
        sc.close();
    }
    public static boolean func(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        return rev.equals(s);
    }
}
//time comp: O(n^2) || space comp: O(n)
// Explanation:
// convert all elements in string to lower and remove non alphanumeric with methods.
//   then loop using manual looping in a reverse order and check for equalance.


//Optimised two-pointer approach
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = sc.nextLine();
        boolean result = func(s);
        System.out.print("Is it palindrome? "+result);
        sc.close();
    }
    public static boolean func(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int l =0; 
        int r =s.length()-1;
        while( l<r ){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
//time comp: O(n) || space comp: O(n)
// Explanation:
// convert all elements in string to lower and remove non alphanumeric with methods.
//   then using two pointers at two end , trail and check for equivalence
  
  

