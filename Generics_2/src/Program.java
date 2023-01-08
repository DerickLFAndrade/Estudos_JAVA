import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.entities.Products;
import model.services.CalculationService;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	List<Products> list = new ArrayList<>();
	
	String path = "c:\\temp\\in.csv";
	
	try(BufferedReader bw = new BufferedReader(new FileReader(path))) {
		String line = bw.readLine();
		String[] source = line.split(",");
		while(line != null) {	
			list.add(new Products(source[0], Double.parseDouble(source[1])));
			line = bw.readLine();
		}
		
		Products x = CalculationService.max(list);
		System.out.println("Max:");
		System.out.println(x);
	}
	catch(IOException e ) {
		e.printStackTrace();;
	}
	
	sc.close();
		
}
}
