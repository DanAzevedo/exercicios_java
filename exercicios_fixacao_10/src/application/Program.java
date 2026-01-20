package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;


public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<TaxPayer>();
		
		System.out.println();
		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Taxpayer #" + n + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);		
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(ch == 'i' || ch == 'I') {
				System.out.println("Health Expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}else if(ch == 'c' || ch == 'C') {
				System.out.println("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}else {
				System.out.println("Invalid character.");
			}
			
			System.out.println();
			System.out.println("TAXES PAID:");
			
		for(TaxPayer tp: list) {
			System.out.println(tp.getName() + " $ " + String.format("%.2f", tp.tax()));
		}
		
		System.out.println();
		Double sum = 0.0;
		for(TaxPayer tp: list) {
			sum += tp.tax();
		}
			
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		}		
	sc.close();
	}

}
