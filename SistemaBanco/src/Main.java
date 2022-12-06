import java.util.Scanner;

import Entities.Conta;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta obj;
		double deposito = 0;
		System.out.println("Nome do titular da conta: ");
		String nomeUsuario = sc.next();
		System.out.println("Número da Conta: ");
		int numeroConta = sc.nextInt();
		System.out.println("Irá efetuar depósito inicial (y/n): ");
		String isDeposito = sc.next();
		
		if(isDeposito.contains("y")) {
			System.out.println("informe o valor:  ");
			deposito = sc.nextDouble();
			
			obj = new Conta(nomeUsuario, numeroConta, deposito);
			 
			System.out.println(obj);
		} else {
			obj = new Conta(nomeUsuario, numeroConta);
			System.out.println(obj);
		}
		
			
		System.out.println("Digite o valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		obj.Deposito(valorDeposito);
		System.out.println("Conta atualizada: \n"  + obj );
		
		System.out.println("Digite o valor do saque: ");
		double valorSaque = sc.nextDouble();
		obj.Saque(valorSaque);
		System.out.println("Conta atualizada: \n"  + obj );
		

		sc.close();

	}
}
