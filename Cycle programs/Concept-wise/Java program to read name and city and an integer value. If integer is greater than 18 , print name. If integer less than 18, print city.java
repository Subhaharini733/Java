import java.util.Scanner; 
class Stringp{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter name :");
        String name=input.nextLine();
        System.out.println("Enter city :");
        String city=input.nextLine();
        System.out.println("Enter integer: ");
        int number=input.nextInt();

        if(number>18){
            System.out.println("The name of the person is "+name);
        }
        else{
            System.out.println("The city of the person is "+city);
        }
    }
}
