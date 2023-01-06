import java.util.Scanner;

import model.services.InterestService;
import model.services.UsaInterestService;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Amount: ");
	double amount = sc.nextDouble();
	System.out.print("Months: ");
	int months = sc.nextInt();
	
	InterestService intService = new UsaInterestService(1.0);
	double payment = intService.payment(amount, months);
	
	System.out.println("Payment after " + months + " months");
	System.out.println(String.format("%.2f", payment));
	sc.close();
}
}
