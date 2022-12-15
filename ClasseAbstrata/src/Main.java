import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class Main {
public static void main (String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	List<Account> list = new ArrayList<>();	
	
	list.add(new BussinesAccount("Derick", 1546, 10000.00, 8000.00));
	list.add(new SavingsAccount("Lucas", 6548, 10000.00, 0.1));
	list.add(new BussinesAccount("Fontes", 9874, 10000.00, 8000.00));
	list.add(new SavingsAccount("Andrade", 9648, 10000.00, 0.1));
	
	for (Account c : list) {
		c.deposit(10.00);
	}
	for (Account c : list) {
		System.out.printf("Number account: %d Balance: %.2f%n", c.getNumber(), c.getBalance());
	}
	
	sc.close();
}
}
