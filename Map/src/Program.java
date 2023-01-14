import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import model.entities.Product;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Map<Product, Double> stoks = new HashMap<>();
	
	Product p1 = new Product("Tv", 900.00);
	Product p2 = new Product("Notebook", 1200.00);
	Product p3 = new Product("Tablet", 4000.00);
	
	stoks.put(p1, 10000.00);
	stoks.put(p2, 20000.00);
	stoks.put(p3, 15000.00);
	
	Product ps = new Product("Tv", 900.00);
 	
	System.out.println("Contains 'ps' key: " + stoks.containsKey(ps));
	
	sc.close();
}
}
