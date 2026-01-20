package entities;

public class Company extends TaxPayer{
	
	private Integer numberOfEmployees;
	
	
	public Company() {
		super();
	}
	
	public Company(String name, Double annualIncomes, Integer numberOfEmployees) {
		super(name, annualIncomes);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public final Double tax() {
		if(numberOfEmployees>10) {
			return  super.getAnnualIncome() * 0.14;
		}else {
			return super.getAnnualIncome() * 0.16;
		}
	} 
}
