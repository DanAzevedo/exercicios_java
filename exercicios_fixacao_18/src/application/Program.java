package application;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// "negativos"
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];

		if(n<=10) {
			for(int i=0;i<vect.length;i++) {
				System.out.print("Digite um número: ");
				vect[i] = sc.nextInt();
			}
		}else {
			System.out.println("Não podem haver mais de 10 números.");
		}
		
		System.out.println("NÚMEROS NEGATIVOS:");
		for(int i=0;i<vect.length;i++) {
			if(vect[i]<0) {
				System.out.println(vect[i]);
			}
		}
			
		sc.close();
	}

}
