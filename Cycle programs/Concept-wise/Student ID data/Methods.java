import java.util.Arrays;
import java.util.Scanner;
class Methods{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  Student student=new Student();
  System.out.println("Enter ID:");
  student.setId(sc.nextInt());
 System.out.println("Enter Name:");
  student.setName(sc.next());
 System.out.println("Enter Address:");
  student.setAddress(sc.next());
  printStudent(student);
}
private static void printStudent(Student student)
{
 System.out.println("Enter ID:"+student.getId());
  System.out.println("Enter Name:"+student.getName());
  System.out.println("Enter Address:"+student.getAddress());
}
}
