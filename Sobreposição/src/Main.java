import java.util.Scanner;

import entities.Account;
import entities.BussinesAccount;
import entities.SavingsAccount;

public class Main {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Account acc1 = new Account("Derick", 65487, 1000.00);
	acc1.withDraw(200.00);
	System.out.println(acc1.getBalance());
	
	Account acc2 = new SavingsAccount("Lucas", 6548, 1000.00, 0.01);
	acc2.withDraw(200.00);
	
	System.out.println(acc2.getBalance());
	
	Account acc3 = new BussinesAccount("Joao", 6548, 1000.00, 2000.00);
	acc3.withDraw(200.00);
	
	System.out.println(acc3.getBalance());
	sc.close();
}
}
