
import java.util.Scanner;

public class Program {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Digite o caminho do arquivo: ");
	String strPath = sc.nextLine();
	
	ReaderArquive reader = new ReaderArquive(strPath);
	
	reader.readerArchive();
	sc.close();
}
}
