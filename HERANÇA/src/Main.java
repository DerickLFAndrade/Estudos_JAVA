import java.util.Scanner;

import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class Main {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Account ac1 = new Account("Derick", 123456, 500000.00);
	BussinesAccount ac2 = new BussinesAccount("Lucas", 1234567, 10000.00, 20000.00);
	
	Account acc1 = ac1;
	System.out.println(acc1.getBalance());
	
	Account acc2 = new BussinesAccount("Rock", 12323, 10.00, 100.00);
	Account acc3 = new SavingsAccount("Derucj Kycas", 6548, 100.00, 0.01);
	
	BussinesAccount acc4 = (BussinesAccount) acc2;
	
	if(acc3 instanceof BussinesAccount) {
		BussinesAccount acc5 = (BussinesAccount) acc3;
		acc5.loan(200.00);
		System.out.println("Load");
	}
	
	if(acc3 instanceof SavingsAccount) {
		SavingsAccount acc5 = (SavingsAccount) acc3;
		acc5.updateBalance();
		System.out.println("Update");
	}
	
	sc.close();
}
}
