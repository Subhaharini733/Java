import java.util.Scanner; 
class Product{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first decimal :");
        float dec_1=input.nextFloat();
        System.out.println("Enter second decimal: ");
        float dec_2=input.nextFloat();
        System.out.println("The product of two decimal values " +dec_1+ " and " +dec_2+ " is " +(dec_1*dec_2));

    }
}

