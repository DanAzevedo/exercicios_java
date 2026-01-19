package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		
		System.out.print("Employee's name: ");
		e.name = sc.next();
		
		System.out.print("Employee's Gross Salary: ");
		e.grossSalary = sc.nextDouble();
		
		System.out.print("Employee's Tax: ");
		e.tax = sc.nextDouble();
		
		System.out.println(e);
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		e.IncreaseSalary(percentage);
		
		System.out.print("Updated data: " + e);
		
		sc.close();
	}

}
