import java.util.Scanner;
class Data{
public static void main(String[] a){
Scanner inp=new Scanner(System.in);
System.out.println("Enter the string:");
String strn=inp.nextLine();
for(int i=1;i<=strn.length();i++){
if(strn.charAt(i)=='a'||strn.charAt(i)=='e'||strn.charAt(i)=='i'||strn.charAt(i)=='o'||strn.charAt(i)=='u'){
System.out.println(strn.charAt(i));
}
}
}
}
