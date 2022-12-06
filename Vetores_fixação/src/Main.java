import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Main {
public static void main (String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.println("Quantos alunos tem na lista?");
	int n = sc.nextInt();
	Alunos[] vect = new Alunos[n];
	for(int i = 0; i < vect.length; i++ ) {
		System.out.println("Digite o nome do aluno: ");
		String nome_aluno = sc.next();
		System.out.println("Nota 1° trimestre: ");
		double nota_1 = sc.nextDouble();
		System.out.println("Nota 2° trimestre: ");
		double nota_2 = sc.nextDouble();
		vect[i] = new Alunos(nome_aluno, nota_1, nota_2);	
	}
	for(int i = 0; i < vect.length; i++) {
		if(vect[i].VerificaAprovacao() == true) {
			 System.out.println(vect[i].getNome());
			 System.out.println(vect[i].CalcularNota());
			}
	}
	
	

	sc.close();
}
}
