class Sample{
public static void main(String[] a){
Scanner input=new Scanner(System.in);
System.out.println("Enter number:");
int num=input.nextInt();
System.out.println("Enter range:");
int range=input.nextInt();
for(int i=1;i<=range;i++){
System.out.println(num +" * "+i+" = "+(num*i));
}
}
}
