package Main;

import java.util.Scanner;

import util.Converter;

public class Main {
public static void main(String[] args) {
	Scanner sc =  new Scanner (System.in);
	double result;
	double porc;
	
	System.out.println("Valor do dólar atual: ");
	Converter.DolarPrice = sc.nextDouble();
	System.out.println("Valor em reais desejado para conversão: ");
	Converter.ValorAComprar = sc.nextDouble();
	Converter.Calcular();
	result = (Converter.Result - (Converter.Result/100*6));
    porc = Converter.Calcular()/100*6;
	
	System.out.printf("Você receberá: %.2f %n ", result);
	System.out.printf("IOF calculado: %.2f", porc);
	sc.close();
}
}
