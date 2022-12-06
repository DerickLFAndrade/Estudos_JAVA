import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.Worker;
import entities.WorkerLevel;

public class Main {
public static void main (String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter department's name: ");
	String dep = sc.nextLine();
	
	System.out.println();
	
	System.out.println("Enter worker Data");
	System.out.print("Name: ");
	String name = sc.nextLine();
	System.out.print("MID_LEVEL: ");
	String mid_level = sc.nextLine();
	System.out.print("Base Salary: ");
	Double baseSalary = sc.nextDouble();
	
	Worker worker= new Worker(name, WorkerLevel.valueOf(mid_level), baseSalary, new Departament(dep));
	
	System.out.println();
	
	System.out.print("How many contracts to this worker? ");
	Integer qtdC = sc.nextInt();
	
	System.out.println();
	for(int i = 0; i < qtdC; i++) {
		System.out.println("Enter contract #"+(i+1));
		sc.nextLine();
		System.out.print("Date: (DD/MM/YYYY): ");
		String date = sc.nextLine();
		
		System.out.print("Value per hour:");
		Integer valuePerHour = sc.nextInt();
		
		System.out.print("Duration: ");
		Integer hours = sc.nextInt();
		
		
	}
	
	
	
	sc.close();
}
}
