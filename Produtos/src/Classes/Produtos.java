package Classes;
public class Produtos{

 public String produto;
 public Double preco;
 public int quantidade;
 
 public Produtos(String produto, double preco, int quantidade) {
	 this.produto = produto;
	 this.preco = preco;
	 this.quantidade = quantidade;
 }
 
 public double totalQuantidade () {
	 return preco * quantidade;
 }
 public void addProduct (int quantidade) {
	 this.quantidade += quantidade;
 }
 public void removeProduct (int quantidade) {
	 this.quantidade -= quantidade;
 }

public String toString() {
	return "Produto: " + produto +", " + "Preço: $" + preco +", " + "Quantidade: " + totalQuantidade();
}
}
