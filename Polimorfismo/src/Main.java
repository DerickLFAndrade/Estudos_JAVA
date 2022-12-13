import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Main {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	System.out.print("Enter the number of employees: ");
	Integer n = sc.nextInt();
	List<Employee> employers = new ArrayList<>();
	for(int i = 0; i < n; i++) {
		
		System.out.println("Employee #" + (i+1) + " data:");
		System.out.print("Outsourced (y/n)?");
		char ot = sc.next().charAt(0);
		if(ot == 'n') {
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			
			System.out.print("Value Per Hour: ");
			Double valuePerHour = sc.nextDouble();
			
			Employee employee = new Employee(name, hours, valuePerHour);
			employers.add(employee);
			
		}
		else if(ot == 'y') {
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			
			System.out.print("Value Per Hour: ");
			Double valuePerHour = sc.nextDouble();
			
			System.out.print("Additional Charge: ");
			Double additionalCharge = sc.nextDouble();
			
			Employee employee = new OutsourceEmployee(name, hours, valuePerHour, additionalCharge);
			employers.add(employee);
		}
	}
	
	System.out.println("Payments: ");
	for(Employee emp : employers) {
		System.out.println(emp);
	}
	
	sc.close();
}
}
