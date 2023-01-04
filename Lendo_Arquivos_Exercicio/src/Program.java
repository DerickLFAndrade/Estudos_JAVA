
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produtos;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite o caminho do arquivo: ");
	String strPath = sc.nextLine();
	
	
	List<Produtos> listProdutos = new ArrayList<>();
	File pathParent = new File(strPath);
	String newPath = pathParent.getParent() + "\\out\\"; 
	new File(newPath).mkdir();
	newPath = newPath+"summary.csv";
	try(BufferedReader file = new BufferedReader(new FileReader(strPath))) {
	 String line = file.readLine();

	 while(line != null) {
		 line = file.readLine();
		 String array[] = new String[3];
		 if(line != null) { 
			 array = line.split(",");
			 String nameProd = array[0];
			 Double priceUnit = Double.parseDouble(array[1]);
			 int quantity = Integer.parseInt(array[2]);
			 System.out.print(nameProd + ", " + priceUnit + ", " + quantity + " ");
			 listProdutos.add(new Produtos(nameProd, priceUnit, quantity));
		 }		
	 }
	 try (BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))) {
		 for (Produtos list : listProdutos) {				
			 bw.write(list.getName() + "," + String.format("%.2f", list.total()));
			 bw.newLine();
		 }
	 } catch(IOException e) {
		 e.printStackTrace();
	 }
	 
	}
	catch(IOException e) {
		e.printStackTrace();
	}
	
	
	
	sc.close();
}
}
