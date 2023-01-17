package model.entities;


public class Employee{
	private String name;
	private String email;
	private Double salary;
	
	public Employee(String name, String email, Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double price) {
		this.salary = price;
	}
	
	public static String staticUpperCaseName(Employee p) {
		return p.getName().toUpperCase();
	}
	public String nonStaticUpperCaseName() {
		return name.toUpperCase();
		}
	
	@Override
	public String toString() {
		return "Product: " + name + "\nEmail" + email +  "\nSalary: " + String.format("%.2f", salary);
	}
	
	
}