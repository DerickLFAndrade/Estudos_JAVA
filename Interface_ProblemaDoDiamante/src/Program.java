

import model.entities.ComboDevice;
import model.entities.ConcretePrinter;
import model.entities.ConreteScanner;

public class Program {
public static void main (String[] args) {
	
	
	ConcretePrinter p = new ConcretePrinter("1080");
	p.processDoc("My Letter");
	p.print("My letter");
	System.out.println();
	ConreteScanner s = new ConreteScanner("2003");
	s.processDoc("My Email");
	System.out.println("Scan result " + s.scan());
	System.out.println();
	ComboDevice c = new ComboDevice("2081");
	c.processDoc("My dissertation");
	c.print("My dissertation");
	System.out.println("Scan result: " + c.scan());
}
}
