import java.util.Scanner;
public class Calculator
{
	static int a = 100,b = 200;
	
	public static void main(String[] args)
	{		
		start();
	}
	
	private static void start()
	{		
		Operations obj = new Operations();
		do
		{
			showInterface();
			System.out.print("enter your choice: ");
			int choice = readInput();
			switch(choice)
			{
				case 1:
					getInput();
					obj.add(a,b);
					System.out.print("Addition of given input is: " +obj.add(a,b) );
					break;
				case 2:
					getInput();
					System.out.print("Difference of given input is: " + obj.subtract(a,b));
					break;			
				case 3:
					getInput();
					System.out.print("Product of given input is: " + obj.product(a,b));
					break;				
				case 4:
					getInput();
					System.out.print("Divisionn of given input is: " + obj.division(a,b));
					break;				
				case 5:
					System.exit(0);break;
				default: 
					System.out.println("Invalid choice entered.");
					break;
			}			
		}while(true);
	}
	
	private static void showInterface()
	{
		System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
	}
	
	private static void getInput()
	{
		System.out.print("enter your first value: ");
		a = readInput();
		System.out.print("enter your second value: ");
		b = readInput();
	}
	
	private static int readInput()
	{
		Scanner scanner = new Scanner(System.in);		
		int input = scanner.nextInt();
		return input;
	}
}
