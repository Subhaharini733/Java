//Leetcode -434- Number of segments in a string

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int result = func(s);
        System.out.print("Number of segments: "+result);
        sc.close();
    }
    static int func(String s){
        if(s == null || s.length() == 0){
            return 0;
        }
        String[] parts = s.split(" ");
        int count = 0;
        for(String part : parts){
            if(!part.isEmpty()){
                count++;
            }
        }
        return count;
    }
}

//time comp: O(n) || space comp: O(n)
Explanation:
