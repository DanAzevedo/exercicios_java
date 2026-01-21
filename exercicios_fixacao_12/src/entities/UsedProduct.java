package entities;

public class UsedProduct extends Product{
	
	private String date;
	
	// constructors
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, String date) {
		super(name, price);
		this.date = date;
	}
	
	// getters and setters
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	// methods
	@Override
	public final String priceTag() {
		return super.getName() +
			   " (used) $ " +
			   super.getPrice() +
			   " (Manufacture date: " +
			   date +
			   ")";		   	
	}

}
