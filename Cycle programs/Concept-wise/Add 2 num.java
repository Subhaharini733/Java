import java.util.Scanner; /*it is implicit as it focuses on file matching scanner-better */
import java.util.*;/*it is explicit as it focuses on files with all possibilities */
class Add{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
       
        System.out.println("Enter first value:");
        int var_1=input.nextInt();
        
        System.out.println("Enter second value:");
        int var_2=input.nextInt();

        int add=var_1+var_2;
        System.out.println("Addition of "+var_1+ " and " +var_2+ " is " +add);

    }
}

