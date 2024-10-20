import java.util.Scanner;
class Sample{
public static void main(String[] a){
int count=0;
for(int i=2; i<=40;i+=2){
count++;
if(count==7){
continue;
}
System.out.print(i+"\t");
}
}
}
