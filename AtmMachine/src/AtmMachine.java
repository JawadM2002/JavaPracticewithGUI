import java.util.Scanner;

public class AtmMachine {

	private double totalBal =100;
	Scanner input = new Scanner(System.in);
	
	public int userAccount( ) {
		System.out.print("Enter Account Number: ");
		int account;
		account = input.nextInt();
		return account;
	}
	public int userPin() {
		System.out.print("Enter Pin number: ");
		int pin;
		pin = input.nextInt();
		
		return pin;
	}
	public void startAtm() {
		userAccount();
		userPin();
		drawMainMenu(); 
	}
	public void drawMainMenu() {
		int selection;
		System.out.println("\nATM main menu:");
		System.out.println("1 - Account Balance");
		System.out.println("2 - Withdraw funds");
		System.out.println("3 - Add Funds");
		System.out.println("4 - Terminate Transaction");
		System.out.print("Choice: ");
		selection =input.nextInt();
		
		switch(selection) {
		case 1: viewAccountInfo();
		break;
		case 2: withdraw();
		break;
		case 3: addFunds();
		break;
		case 4: System.out.println("Thank you for using the ATM, see you later!");
		}
	}
	private void withdraw() {
		int withdrawSelection;
		
		System.out.println("Withdraw funds:");
		System.out.println("1 - £20");
		System.out.println("2 - £40");
		System.out.println("3 - £80");
		System.out.println("4 - £100");
		System.out.println("5 - Back to Menu");
		System.out.print("Choice: ");
		withdrawSelection = input.nextInt();
		switch(withdrawSelection) {
		case 1: checkNsf(20);
		drawMainMenu();
		break;
		case 2: checkNsf(40);
		drawMainMenu();
		break;	
		case 3: checkNsf(80);
		drawMainMenu();
		break;
		case 4: checkNsf(100);
		drawMainMenu();
		break;
		case 5: 
		drawMainMenu();
		break;
		}	
	}
	
	
	public void addFunds() {
		int addSelection;
		
		System.out.println("Deposit funds:");
		System.out.println("1 - £20");
		System.out.println("2 - £40");
		System.out.println("3 - £80");
		System.out.println("4 - £100");
		System.out.println("5 - Back to Menu");
		System.out.print("Choice: ");
		addSelection = input.nextInt();
		switch(addSelection) {
		case 1: deposit(20);
		drawMainMenu();
		break;
		case 2: deposit(40);
		drawMainMenu();
		break;	
		case 3: deposit(80);
		drawMainMenu();
		break;
		case 4: deposit(100);
		drawMainMenu();
		break;
		case 5: 
		drawMainMenu();
		break;
		}
	}
	
	public void deposit(int depAmount) {
		System.out.println("\n***Please insert money now...****");
		totalBal = totalBal +depAmount;
	}
	
	public void checkNsf(int withdrawAmount) {
		if(totalBal - withdrawAmount < 0)
		System.out.println("\n***ERROR!! Insufficient funds!");
		else {
			totalBal = totalBal - withdrawAmount;
			
			System.out.println("\n***Please take money now...****");
		}
	}
	
	
	public void viewAccountInfo() {
	System.out.println("Account Information:");
	System.out.println("\t--Total balance: £" +totalBal);
		drawMainMenu();
	}
	

public static void main(String arg[]) {
	AtmMachine myAtm = new AtmMachine();
	myAtm.startAtm();
}
}
