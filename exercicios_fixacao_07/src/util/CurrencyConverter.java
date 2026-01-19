package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double CurrencyCalculator(double dollarQuote, double amountDollarsToBuy) {
		return ((dollarQuote * amountDollarsToBuy) + (dollarQuote * amountDollarsToBuy * IOF));
	} 

}
