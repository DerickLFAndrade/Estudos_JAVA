package entities;

public class CNPJ  extends People{
	private Integer totalEmployees;
	
	public CNPJ(String name, Double annualIncome, Integer totalEmployess) {
		super(name, annualIncome);
		this.totalEmployees = totalEmployess;
	}

	@Override
	public Double totalTaxes() {
		return getAnnualIncome() * totalEmployees;
	}

}
