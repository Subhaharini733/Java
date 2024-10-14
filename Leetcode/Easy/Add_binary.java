//Leetcode -67- Add binary

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string a: ");
        String a= sc.next();
        System.out.print("Enter string b: ");
        String b = sc.next();
        String result = func(a,b);
        System.out.print(result); 
        sc.close();
    }
    private static String func(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry;
            if(i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum /2;
        }
        return sb.reverse().toString();
    }
}

// Explanation:
// Time comp: O(max(m,n)) where m and n are lengths of strings- processes each bit of the strings once.
// Space comp: O(max(m,n)) as stringbuilder is used to store the result.
// traverse strings in reverse with i and j
// then proceed only when i>=0 or j>=0  or carry>0
// push carry already got to sum before adding bits
// add the charAt(i) of a string into sum followed by j
// then to calculate carry = sum/2 is used (possibilities: 0,1,2,3 when 0,1,2 ->carry is o when 3->carrs is 1).
// then append sum into stringbuilder by sum%2 to store everything in digits(possibilities: either 0 or 1).
// then reverse the stringbuilder and convert it to string.
