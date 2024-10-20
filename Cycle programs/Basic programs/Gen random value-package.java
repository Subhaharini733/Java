import java.util.Random;
public class Random{
    public static void main(String args[]) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(100);
        System.out.println("Random Integer: "+rand_int1);
        System.out.println("Random Integer: "+rand_int2);
    }
}
