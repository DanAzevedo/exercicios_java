package entities;

public class ImportedProduct extends Product{
	
	private Double customsFee;
	
	// constructor
	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	// getters and setters
	public Double getCustomsFee() {
		return customsFee;
	}
	
	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	// methods
	@Override
	public final String priceTag() {
		return super.priceTag() +
			   "(Customs fee: $ " +
			   customsFee +
			   ")";			   	
	}

}
