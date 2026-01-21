package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account acc = new Account(1001, "Daniel Azevedo", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Daniel BA", 0.0, 500.00);
		
		// UPCASTING - atribuir um objeto da subclasse para uma variável de superclasse
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Daniel BA1", 0.0, 500.00);
		Account acc3 = new SavingsAccount(1004, "Daniel SA", 0.0, 0.01);
		
		// DOWNCASTING
		BusinessAccount acc4 = (BusinessAccount)acc2; // é uma instância do BusinessAccount ou do Account
		
		if(acc3 instanceof BusinessAccount) { // como ela não é, esse if irá falhar
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {// como ela é, esse if irá executar
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account accPoli = new Account(1200, "Daniel Polimorfismo 1", 1000.0);
		accPoli.withdraw(200.0);
		System.out.println(accPoli.getBalance());
		
		Account accPoli2 = new SavingsAccount(1201, "Daniel Polimorfismo 2", 1000.0, 0.01);
		accPoli2.withdraw(200.0);
		System.out.println(accPoli2.getBalance());
		
		Account accPoli3 = new BusinessAccount(1202, "Daniel Polimorfismo 3", 1000.0, 500.0);
		accPoli3.withdraw(200.0);
		System.out.println(accPoli3.getBalance());
	}

}
