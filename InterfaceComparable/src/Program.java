import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import model.entities.Employees;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	String path = "c:\\temp\\employees.csv";
	List<Employees> employeesList = new ArrayList<>();
	try(BufferedReader bw = new BufferedReader(new FileReader(path))){
		String line = bw.readLine();
		while(line != null) {
			String[] split = line.split(",");
			String name = split[0];
			Double salary = Double.parseDouble(split[1]);
			employeesList.add(new Employees(name, salary));
			line = bw.readLine();
		}
		Collections.sort(employeesList);
		for(Employees list : employeesList) {
			System.out.println(list.getName() + " " + String.format("- R$%.2f", list.getSalary()));
		}
		}
	catch(IOException e){
		e.printStackTrace();
	}
	
	sc.close();
}
}
