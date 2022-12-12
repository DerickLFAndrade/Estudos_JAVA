package entities;

public class Account {
	private String name;
	private Integer number;
	protected  Double balance;

	public Account() {
	}
	
	public Account(String name, Integer number, Double balance) {
		this.name = name;
		this.number = number;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getBalance() {
		return balance;
	}
	
	public double withdraw(Double amount) {
		return balance -=amount;
	}
	public double deposit(Double deposit) {
		return balance +=deposit;
	}
	
}
