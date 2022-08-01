import java.util.Scanner;

public class AddingNumbers {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number:");
	int a = scan.nextInt(); //Allows you to enter an integer
	
	System.out.println("Enter another number:");
	int b = scan.nextInt(); //Allows you to enter the next integer to add with
	
	System.out.println(a + b); // Adds numbers together
	
	}

}
