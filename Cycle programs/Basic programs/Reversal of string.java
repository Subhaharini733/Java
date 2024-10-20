import java.io.*;
import java.util.Scanner;
 public class Reversenum {
    public static void main (String[] args) {
        String str= "Welcome", rstr="";
        char ch;
      System.out.print("Original string: ");
      System.out.println("Welcome");
      for (int i=0; i<str.length(); i++) {
        ch= str.charAt(i); 
        rstr= ch+rstr; 
      }
      System.out.println("Reversed string: "+ rstr);
    }
}
