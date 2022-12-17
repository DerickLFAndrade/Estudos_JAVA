package entities;

public class CNPJ  extends People{
	private Integer totalEmployees;
	
	public CNPJ(String name, Double annualIncome, Integer totalEmployess) {
		super(name, annualIncome);
		this.totalEmployees = totalEmployess;
	}

	@Override
	public Double totalTaxes() {
		if(this.totalEmployees > 10) {
			return this.getAnnualIncome()/100*14;
		}
		else {
			return this.getAnnualIncome()/100*16;
		}
	}

}
