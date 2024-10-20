class Sample{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the day of week:");
String week=input.nextLine();
String result="";
result=switch(week){
case "Monday","Wednesday","Tuesday"->"6 a.m";
case "Thursday","Saturday","Sunday" ->"7 a.m";
case "Friday" ->"6.45 a.m";
default ->"Invalid value";
};
System.out.println(result);
}
}
