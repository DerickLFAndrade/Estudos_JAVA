import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

public class Main {
public static void main (String[] args) throws ParseException {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	System.out.print("Enter department's name: ");
	String dep = sc.nextLine();
	
	System.out.println();
	
	System.out.println("Enter worker Data");
	System.out.print("Name: ");
	String name = sc.nextLine();
	System.out.print("MID_LEVEL: ");
	String level = sc.nextLine();
	System.out.print("Base Salary: ");
	Double baseSalary = sc.nextDouble();
	
	Worker worker= new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Departament(dep));
	
	System.out.println();
	
	System.out.print("How many contracts to this worker? ");
	Integer qtdC = sc.nextInt();
	
	System.out.println();
	for(int i = 0; i < qtdC; i++) {
		System.out.println("Enter contract #"+(i+1));
		sc.nextLine();
		System.out.print("Date: (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.next());

		
		System.out.print("Value per hour:");
		Double valuePerHour = sc.nextDouble();
		
		System.out.print("Duration: ");
		Integer hours = sc.nextInt();
		HourContract contract = new HourContract(date, valuePerHour, hours);
		
		worker.addContract(contract);
		
	}
	
	System.out.print("Enter month and year to calculate income: (MM/YYYY)");
	String income = sc.next();
	Integer month = Integer.parseInt(income.substring(0,2));
	Integer year = Integer.parseInt(income.substring(3));
	
	
	System.out.println(worker.income(year, month));
	sc.close();
}
}
