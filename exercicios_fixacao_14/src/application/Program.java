package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:" );
			System.out.println("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.println("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}else if(ch == 'c') {
				System.out.println("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}else {
				System.out.println("Invalid character! Dumb!");
			}	
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for(Person person : list) {
			System.out.println(person.getName() + ": $ " + String.format("%.2f", person.tax()));
		}
	}
}
