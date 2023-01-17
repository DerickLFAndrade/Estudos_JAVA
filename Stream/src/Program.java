import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.entities.Employee;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String path = "c:\\temp\\in.csv\\";
	
	System.out.println("Enter salary: ");
	Double salary = sc.nextDouble();
	
	try(BufferedReader br = new BufferedReader(new FileReader(path))){
		
		List<Employee> list = new ArrayList<>();
		
		String line = br.readLine();
		while(line != null) {
			String[] fields = line.split(",");
			list.add( new Employee(fields[0], fields[1],Double.parseDouble(fields[2])));
			line = br.readLine();
		}
		
		List<String> email = list.stream().filter(p -> p.getSalary() > salary).map(p -> p.getEmail()).sorted().collect(Collectors.toList());
		
		System.out.println("Email of people whose salary is more than 2000.00:");
		email.forEach(System.out::println);
		
		double sum = list.stream().filter(p -> p.getName().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0, (x,y) -> x + y);
		
		System.out.println("Sum of salary whose name starts with 'M': " + String.format("%.2f", sum));
		
		
		}
	catch(IOException e) {
		e.printStackTrace();
	}
	
	sc.close();
}
}
