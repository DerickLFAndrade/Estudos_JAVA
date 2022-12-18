import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.CNPJ;
import entities.CPF;
import entities.People;

public class Main {
public static void main (String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	List<People> list = new ArrayList<>();
	
	System.out.print("Enter the number of tax payers: ");
	Integer n = sc.nextInt();
	
	for( int i = 1; i <=n; i++) {
		System.out.println("Tax payer #" + i + " data:");
		System.out.print("CPF ou CNPJ? (f/j): ");
		char c = sc.next().charAt(0);
		
		System.out.print("Name: ");
		String name = sc.next();
		System.out.print("Anual Income: ");
		Double anualInome = sc.nextDouble();
		
		if(c == 'f') {
			System.out.print("Health expenditures: ");
			Double healthExpenses = sc.nextDouble();
			
			list.add(new CPF(name, anualInome, healthExpenses));
		}
		else if (c == 'j') {
			System.out.print("Number of employees: ");
			Integer numberEmployees = sc.nextInt();
			
			list.add(new CNPJ(name, anualInome, numberEmployees));
		}
		
		
	}
	
	System.out.println("\nTaxes paid: ");
	Double totalTaxes = 0.00;
	for (People c : list) {
		System.out.println(c.getName()+": $"+ c.totalTaxes());
		totalTaxes += c.totalTaxes();
	}
	
	System.out.println("\nTotal Taxes: ");
	System.out.println(totalTaxes);
	sc.close();
}
}
