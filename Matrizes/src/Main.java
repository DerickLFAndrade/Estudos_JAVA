import java.util.Scanner;

public class Main {
public static void main (String[] args) {
Scanner sc = new Scanner(System.in);
	
	int linha = 3;
	int coluna = 4;
	
	int[][] matriz = new int[linha][coluna];
	
for(int l = 0; l < linha; l++) {
	for (int c = 0; c < coluna; c++) {
		int valor = sc.nextInt();
		matriz[l][c] = valor; 
	}	

}

System.out.println("Matriz completa:");
System.out.println("0,0 0,1 0,2");
System.out.println("1,0 1,1 1,2");
System.out.println("2,0 2,1 2,2");
System.out.println(">>>>>>>>>>>>>>>>>>>");
for(int r = 0; r < linha; r++) {
	for(int c = 0; c < coluna; c++) {
		System.out.print(matriz[r][c] + " ");
	}
	System.out.println();
}
System.out.println("------------------------------------");
System.out.println("Matriz colunas:");
System.out.println(">>>>>>>>>>>>>>>>>>>");
for(int r = 0; r < linha; r++) {
	for(int c = 0; c < coluna; c++) {
		System.out.print(matriz[r][c]);		
	}
	System.out.print(" - ");	
}


	sc.close();
}
}
