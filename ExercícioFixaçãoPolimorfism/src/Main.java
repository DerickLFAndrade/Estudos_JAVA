import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {
public static void main (String[] args) throws ParseException {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	List<Product> productList = new ArrayList<>();
	
	System.out.print("Enter the number of products: ");
	Integer n = sc.nextInt();
	
	for(int i =0; i < n; i++) {
		System.out.println("Product #" +(i+1) + " data:");
		System.out.print("Common, imported or used (c/i/u)? ");
		char ch = sc.next().charAt(0);
		
		System.out.print("Name: ");
		String name = sc.next();
		
		System.out.print("Price: ");
		Double price = sc.nextDouble();
		
		if(ch == 'i') {
			System.out.print("Customs fee: ");
			Double cf = sc.nextDouble();
			
			Product productImported = new ImportedProduct(name, price, cf);
			productList.add(productImported);
		}
		else if (ch == 'u') {
			System.out.print("Manufacture date (DD/MM/YYYY): ");
			Date manufactureDate = sdf.parse(sc.next());
			
			Product productUsed= new UsedProduct(name, price, manufactureDate);
			productList.add(productUsed);
		}
		else {
			Product productCommons = new Product(name, price);
			productList.add(productCommons);
		}
		
		
		System.out.println();
	}
	for(Product prod : productList) {			
		System.out.println(prod.priceTag());
	}
	
	sc.close();
}
}
