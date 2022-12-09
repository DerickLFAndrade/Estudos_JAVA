package entities;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private LocalDateTime date;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> orderItem = new ArrayList<>();
	
	public Order(LocalDateTime date, OrderStatus status, Client client) {
		this.date = date;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem orderItem) {
		this.orderItem.add(orderItem);
	}
	public void removeItem(OrderItem orderItem) {
		this.orderItem.remove(orderItem);
	}
	public double total() {
		Double totalOrder = null;
		for(OrderItem order : orderItem) {
			totalOrder = totalOrder + order.subTotal();
		}
		return totalOrder;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: " + sdf.format(date) + "\n");
		sb.append(status + "\n");
		sb.append(client.toString());
		sb.append(orderItem.toString());
		
		return sb.toString();
	}

}
