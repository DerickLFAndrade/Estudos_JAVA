import java.util.Scanner;

import entities.Quartos;

public class Main {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Quantos alunos irão alugar um quarto? (máx 10)");
	
	int n = sc.nextInt();
	int[] qtdAlunos = new int[n];
	Quartos[] quartos = new Quartos[10];
	
	for(int i = 0; i < qtdAlunos.length; i++) {
	    System.out.println("Aluguel #"+(i+1));
	    System.out.print("Nome: ");
	    String nome = sc.next();
	    System.out.print("Email: ");
	    String email = sc.next();
	    System.out.print("N° quarto: ");
	    int quarto = sc.nextInt();
		quartos[quarto] = new Quartos(nome, email, quarto);	
		
	}
	System.out.println("Quartos Alugados: ");
	for(Quartos obj : quartos ) {
		
		if(obj != null) {
			System.out.println(obj);
		}
			
	}
	
	sc.close();
}
}
