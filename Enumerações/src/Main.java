import java.util.Date;
import java.util.Scanner;

import Entities.Pedidos;
import Entities.enums.OrderStatus;

public class Main {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Pedidos pedidos = new Pedidos(1080, new Date(), OrderStatus.PENDING_PAYMENT);
	System.out.println(pedidos);
	
	OrderStatus os1 = OrderStatus.DELIVERED;
	OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
	System.out.println(os1);
	System.out.println(os2);
	sc.close();
}
}
