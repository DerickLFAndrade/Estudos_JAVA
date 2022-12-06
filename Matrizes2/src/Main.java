import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int linha;
		int coluna;

		System.out.print("Infome a quantidade de linhas da matriz: ");
		linha = sc.nextInt();

		System.out.println();

		System.out.print("Agora informe a quantidade das colunas: ");
		coluna = sc.nextInt();

		int[][] matriz = new int[linha][coluna];
		
		for(int l = 0; l < matriz.length; l++) {
			System.out.print("Informe os " + matriz[l].length + " valores da " + (l+1) + "° " + "Linha separando por espaço: ");
			for(int c = 0; c < matriz[l].length; c++) {
				matriz[l][c] = sc.nextInt();
			}
		}
		System.out.print("Qual número da matriz informada deseja obter as informações: ");
		int x = sc.nextInt();
		int quantidade = 0;
		System.out.println();
		for(int l = 0; l < matriz.length; l++) {
			for(int c = 0; c < matriz[l].length; c ++) {
				if(matriz[l][c] == x) {
					quantidade ++;
					System.out.println("Posição: " + l +","+ c );
					if(c -1 >= 0) {
						System.out.println("Left: " + matriz[l][c-1]);
					}
					
					if(c + 1 < matriz[l].length) {
						System.out.println("Right: " + matriz[l][c+1]);
					}
					
					if(l - 1 >  0) {
						System.out.println("Up: " + matriz[l-1][c]);
					}
					if(l + 1 < matriz.length) {
						System.out.println("Down: " + matriz[l+1][c]);
					}
					
				}
			}
		}
		System.out.println();
		String vez = quantidade > 1 ? "vezes": "vez";
		System.out.println("A quantidade de vezes que o número "+ x +" informado anteriormente aparece é: "+ quantidade + " " + vez);
		
		sc.close();
	}
}
