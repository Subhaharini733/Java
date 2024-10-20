import java.util.Scanner; 
class Remainder{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number 1 :");
        float num1=input.nextFloat();
        System.out.println("Enter number 2 : ");
        float num2=input.nextFloat();
        System.out.println("Remainder of the given numbers : "+(num1%num2));

    }
}
