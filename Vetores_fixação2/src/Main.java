import java.util.Locale;
import java.util.Scanner;

import entities.NumerosNegativos;

public class Main {
public static void main (String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Quantos numeros você vai digitar?");
	int n = sc.nextInt();
	NumerosNegativos[] numeros = new NumerosNegativos[n];
	
	for(int i = 0; i < numeros.length; i++ ) {
		System.out.print("Digite um número: ");
		int num = sc.nextInt();
		numeros[i] = new NumerosNegativos(num);	
	}
	for(int i = 0; i < numeros.length; i++ ) {
		if(numeros[i].getNumeros() < 0) {
			System.out.println(numeros[i]);
		}
	}

	sc.close();
}
}
