import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.function.Predicate;

import model.entities.Product;
//import model.util.ProductPredicate;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	//É uma interface que possui um único método abstrato. Suas implementações serão tratados como expressões lambda.
	
	List<Product> list = new ArrayList<>();
	list.add(new Product("TV", 900.00));
	list.add(new Product("Mouse", 50.00));
	list.add(new Product("Notebook", 1200.00));
	list.add(new Product("Tablet", 450.00));
	list.add(new Product("HD Case", 80.0));
	
	//1° implementando a interface Predicate em uma classe separada
	//list.removeIf(new ProductPredicate());
	
	//2° criando um método estático e chamando por referencia usando '::'  
	//list.removeIf(Product::staticProductPredicate);
	
	//3° criando um método não estático  e chamando por referencia usando '::'
	//list.removeIf(Product::nonStaticProductPredicate);
	
	//4° expressão declarada
	//Predicate<Product> pred = p-> p.getPrice() >=100.0;
	//list.removeIf(pred);
	
	//5° expressão inline
		list.removeIf(p -> p.getPrice() >=100.0);
	
	for(Product p : list) {
		System.out.println(p);
	}
	sc.close();
}
}
