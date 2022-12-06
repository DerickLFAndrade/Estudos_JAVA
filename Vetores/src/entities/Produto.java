package entities;

public class Produto {
private String produto;
private double price;
public Produto(String produto, double price) {
	this.produto = produto;
	this.price = price;
}
public String getProduto() {
	return produto;
}
public void setProduto(String produto) {
	this.produto = produto;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Produto [produto=" + produto + ", price=" + price + "]";
}

}
