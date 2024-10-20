public class Prime{
public static void main(String args[]){
int num=7,count=0;
for(int i=1;i<=num;i++){
if(num%i==0){
count++;
}
}
if(count==0){
System.out.println("the"+num+"is prime");
}else{
System.out.println("the"+num+"is not prime");
}
}
}

