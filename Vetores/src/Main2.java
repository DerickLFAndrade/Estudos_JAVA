import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main2 {
public static void main (String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int n = 3;
	Produto[] vect = new Produto[n];

	double result = 0;
	for(int i = 0; i < vect.length; i++ ) {
		System.out.println("Produto: ");
		String produto = sc.next();
		System.out.println("Preço: ");
		double preco = sc.nextDouble();
		vect[i] = new Produto(produto, preco);
		result += vect[i].getPrice();
		System.out.println(vect[i]);
	}
	
	System.out.printf("Média: %.2f", result/vect.length);
	sc.close();
}
}
