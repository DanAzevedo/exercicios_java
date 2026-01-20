package entities;

public abstract class TaxPayer {
	
	protected String name;
	protected Double anualIncome;
	
	
	public TaxPayer() {
		
	}
	
	public TaxPayer(String name, Double annualIncome) {
		this.name = name;
		this.anualIncome = annualIncome;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getAnnualIncome() {
		return anualIncome;
	}
	
	public void setAnnualIncome(Double annualIncome) {
		this.anualIncome = annualIncome;
	}
	
	public abstract Double tax();

}
