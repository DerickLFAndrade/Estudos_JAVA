package model.entities;

public class ConreteScanner extends Device implements Scanner{
	
	public ConreteScanner(String serialNumber) {
		super(serialNumber);
	}


	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Scanned content";
	}
}