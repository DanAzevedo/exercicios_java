package application;
import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's the dollar price? ");
		double dollarQuote = sc.nextDouble();
		
		System.out.print("How many dollar will be bought? ");
		double amountDollarsToBuy = sc.nextDouble();
		
		double total = CurrencyConverter.CurrencyCalculator(dollarQuote, amountDollarsToBuy);
		
		System.out.printf("Amount to be paid in R$: %.2f", total);
		sc.close();
	}

}
