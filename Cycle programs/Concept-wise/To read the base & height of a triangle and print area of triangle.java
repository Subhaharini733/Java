import java.util.Scanner; 
class Area{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter base value :");
        float base=input.nextFloat();
        System.out.println("Enter height value: ");
        float height=input.nextFloat();
        double area=0.5*base*height;
        System.out.println("Area of traingle : " +area);

    }
}
