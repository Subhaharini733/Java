import java.util.Scanner;
class Solution{
    public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    int n = sc.nextInt();
    boolean result = func(n);
    if(result == true){
        System.out.println(n+" is a Disarium number");
    }
    else{
        System.out.println(n+" is not a Disarium number");
    }
    sc.close();
    }
    public static boolean func(int n){
        int temp = n;
        int num = func1(n);
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum = sum + (int)Math.pow(digit, num);
            n /= 10;
            num--;
        }
        return temp == sum;
    }
    public static int func1(int n){
        int count = 0;
        while(n > 0){
            n /= 10;
            count++;
        }
        return count;
    }
    
}
