public class Plaindromestr{
public static void main(String[] args){
string str="lol";
string o_str=str;
string rev="";
int len=str.length();
for(int i=len-1;i>=0;i--){
rev=rev+str.charAt(i);
}
if(o_str.equals(rev)){
System.out.println("It is palindrome");
}else{
System.out.println("It is not palindrome");
}
}
}
