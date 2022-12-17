package entities;

public class CPF extends People {
	private Double healthExpenses;

	public CPF(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = annualIncome;
	}

	@Override
	public Double totalTaxes() {
		if (this.healthExpenses > 0) {
			if (this.getAnnualIncome() < 20000) {
				return (this.healthExpenses / 100)*50 - (this.getAnnualIncome() / 100)*15 ;
			} else {
				return (this.healthExpenses / 100)*50 - (this.getAnnualIncome() / 100)*25 ;
			}
		} 
		
		else {
			if (this.getAnnualIncome() < 20000) {
				return (this.getAnnualIncome() / 100)*15;
			} else {
				return (this.getAnnualIncome() / 100)*25;
			}
		}

	}

}
