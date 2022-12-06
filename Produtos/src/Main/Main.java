package Main;

import java.util.Scanner;

import Classes.Produtos;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produtos x;
		

		System.out.println("Produto: ");
		String produto = sc.next();
		System.out.println("Preço do produto: ");
	    double preco = sc.nextDouble();
		System.out.println("Quantidade: ");
		int quantidade = sc.nextInt();
		x = new Produtos(produto, preco, quantidade);
		System.out.println(x);

		System.out.println("Adicionar estoque: ");
		int qtd = sc.nextInt();
		x.addProduct(qtd);
		System.out.println(x);

		System.out.println("Remover estoque: ");
		qtd = sc.nextInt();
		x.removeProduct(qtd);
		System.out.println(x);

		sc.close();

	}
}
