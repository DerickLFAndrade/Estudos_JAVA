import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Main {
public static void main (String[] args) throws ParseException {
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	System.out.println("Enter Client data: ");
	System.out.print("Name: ");
	String name = sc.nextLine();
	System.out.print("Email: ");
	String email = sc.nextLine();
	System.out.print("Birth data (DD/MM/YYYY): ");
	String date = sc.nextLine();
	System.out.println();
	System.out.println("Enter Order data: ");
	System.out.print("Status: ");
	String statusS = sc.nextLine();
	LocalDateTime dateOrder = LocalDateTime.now();
	Order order = new Order( dateOrder, OrderStatus.valueOf(statusS), new Client(name, email, sdf.parse(date)));
	
	System.out.print("How many items to this order: ");
	Integer n = sc.nextInt();
	
	for(int i = 0; i < n; i++ ) {
		System.out.print("Enter #" + (i+1) +" item data:");
		String productName = sc.nextLine();
		System.out.print("Product price: ");
		Double price = sc.nextDouble();
		
		System.out.print("Quantity: ");
		Integer quantity = sc.nextInt();
		OrderItem orderItem = new OrderItem(quantity, price, new Product(productName, price));
		
		order.addItem(orderItem);
		
	}
	
	sc.close();
}
}
