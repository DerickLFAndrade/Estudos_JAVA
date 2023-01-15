import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
//import java.util.function.Predicate;
//import java.util.function.Consumer;

import model.entities.Product;
//import model.util.ProductPredicate;
//import model.util.PriceUpdate;

public class Program {
public static void main (String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	
	List<Product> list = new ArrayList<>();
	list.add(new Product("TV", 900.00));
	list.add(new Product("Mouse", 50.00));
	list.add(new Product("Tablet", 350.50));
	list.add(new Product("HD Case", 80.90));
	
	//1° list.forEach(new PriceUpdate());
	//2° list.forEach(Product::staticPriceUpdate);
	//3° list.forEach(Product::nonStaticPriceUpdate);
	//4° double factor = 1.1; Consumer<Product> cons = p -> p.setPrice(p.getPrice()*factor); list.forEach(cons);
	
	//5°
	list.forEach(p -> p.setPrice(p.getPrice()*1.1));
	
	list.forEach(System.out::println);
	sc.close();
}
}
