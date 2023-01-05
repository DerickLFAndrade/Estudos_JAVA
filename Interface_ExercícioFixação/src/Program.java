import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {
public static void main (String[] args) throws ParseException {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	System.out.println("Entre com os dados do contrato:");
	System.out.print("Número: ");
	Integer numero = sc.nextInt();
	System.out.print("Data (DD/MM/AAAA): ");
	LocalDate date = LocalDate.parse(sc.next(), fmt);
	System.out.print("Valor do contrato: ");
	Double totalValue = sc.nextDouble(); 
	Contract cr = new Contract(numero, date, totalValue);
	
	System.out.print("Entre com o número de parcelas: ");
	Integer installment = sc.nextInt();
	
	ContractService contractService = new ContractService(new PaypalService());
	
	contractService.processContract(cr, installment);
	
	for(Installment ist : cr.getInstallmentList()) {
		System.out.println(ist);
	}
	sc.close();
}
}
