import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.AmountLimitException;

public class Main {
public static void main (String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	try {
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		
		sc.nextLine();
		System.out.print("Balance: ");
		Double balance = sc.nextDouble();
		
		
		System.out.print("Withdraw Limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit) ;
		
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		
		acc.withdraw(amount);
		System.out.print("New Balance: " + acc.getBalance());
	}
	catch(AmountLimitException e) {
		System.out.println(e.getMessage());
	}
	
	sc.close();
}
}
