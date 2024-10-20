import java.util.Scanner; 
class Stringrev{
    public static void main(String[] args){
        String strng="Subha";
       
        for(int i=0; i<strng.length(); i++){
            String revstrng= strng.charAt(i)+revstrng;
        }
        System.out.println("The string: "+strng);
        System.out.println("The reversed string: "+revstrng);
    }
}
