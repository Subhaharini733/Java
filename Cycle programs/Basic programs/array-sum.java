public class Sum {  
    public static void main(String[] args) {  
        int [] arr = new int [] {5,4,3,2,1};  
        int sum = 0;  
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements in array: " + sum);  
    }  
}
