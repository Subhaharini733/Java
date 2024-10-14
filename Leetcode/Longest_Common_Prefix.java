// Longest Common Prefix
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string size: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];
        System.out.println("Enter string elements: ");
        for(int i=0; i<n; i++){
            str[i] = sc.nextLine();
        }
        if(str == null || str.length == 0){
            System.out.print("Longest Common Prefix: ");
        }
        else{
            String result = func(str, n);
            System.out.print("Longest Common Prefix: "+result);
        }
        sc.close();
    }
    public static String func(String[] str, int n){
        String prefix = str[0];
        for(int i=1; i<n; i++){
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
}
// Explanation:
// Assign prefix = str[0] -> prefix = flower
// then loop from the next string to check the condition
// check if prefix is index of str[i], if yes loop exits else minimize preifx by using substring and reducing the length every single time until common preix is found
//   str[i].indexOf(flower) != 0{
//   prefix = prefix.substring(0, prefix.length()-1);
// }
// next for str[2]: "flow" will be at prefix as result and checked with "flight" and preifx is modified with final result :"fl"
// print " " if prefix at lst is empty and return prefix.
