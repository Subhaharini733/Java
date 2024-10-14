//Leetcode -657- Robot return to origin

//Brute force approach
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        boolean result = func(s);
        System.out.print("Robot return to origin?: "+result);
        sc.close();
    }
    public static boolean func(String s){
        int x=0;
        int y=0;
        for(int i=0; i<s.length(); i++){
            char move = s.charAt(i);
            switch(move){
                case 'U':
                   y += 1;
                   break;
                case 'D':
                   y -= 1;
                   break;
                case 'R':
                   x += 1;
                   break;
                case 'L':
                   x -= 1;
                   break;
            }
        }
        return x == 0 && y == 0;
    }
}

// Explanation:
// Time comp: O(n) || Space comp: O(1)
//   declare x , y as 0 to determine x and y coordinates
//   then get one char from string and check if R or U, add 1 to x and y 
//   Else if L or D, minus 1 from x and y 
//   return if x and y is equal to 0.

//Brute force - Array
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        boolean result = func(s);
        System.out.print("Robot return to origin?: "+result);
        sc.close();
    }
    public static boolean func(String s){
        int x=0;
        int y=0;
        for(char move : s.toCharArray()){
            switch(move){
                case 'U':
                   y += 1;
                   break;
                case 'D':
                   y -= 1;
                   break;
                case 'R':
                   x += 1;
                   break;
                case 'L':
                   x -= 1;
                   break;
            }
        }
        return x == 0 && y == 0;
    }
}

//Brute force - if condition
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        boolean result = func(s);
        System.out.print("Robot return to origin?: "+result);
        sc.close();
    }
    public static boolean func(String s){
        int x=0;
        int y=0;
       for(int i=0; i<s.length(); i++){
           if(s.charAt(i) == 'L'){
               x++;
           }
           if(s.charAt(i) == 'R'){
               x--;
           }
           if(s.charAt(i) == 'U'){
               y++;
           }
           if(s.charAt(i) == 'D'){
               y--;
           }
       }
        return x == 0 && y == 0;
    }
}

//Optimised approach - HashMap
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        boolean result = func(s);
        System.out.print("Robot return to origin? "+result);
        sc.close();
    }
    public static boolean func(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('U', 0);
        map.put('D', 0);
        map.put('R', 0);
        map.put('L', 0);       
    for(char move : s.toCharArray()){
        map.put(move, map.get(move)+1);
    }
    return map.get('U').equals(map.get('D')) &&
           map.get('R').equals(map.get('L'));
    }
}

// Explanation:
// Time comp: O(n) || Space comp: O(1)
// Create a HashMap class from Map interface with return values character and integer
// give input values for all directions to 0
// now get every character from array and put +1 from directions when occurred
//     map.put will update directions where map.get is used to get the direction called and added to 1.
// then return true if U == D at the same time L == R.
