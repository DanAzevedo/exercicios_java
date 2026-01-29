package application;
import java.util.Locale;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// "soma_vetor"
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vai digitar? ");
		int n = sc.nextInt();
		Double[] vect = new Double[n];
		
		if(n<=10) {
			for(int i=0; i<vect.length; i++) {
				System.out.print("Digite um número: ");
				vect[i] = sc.nextDouble();
			}
		}
		
		Double soma = 0.0;
		for(int i=0; i<vect.length; i++) {
			soma += vect[i];
		}
		
		Double media = soma / vect.length;
		
		System.out.print("VALORES = ");
		for(int i=0; i<vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.println();
		System.out.println("SOMA = " + soma);
		System.out.println("MÉDIA = " + media);

		sc.close();
	}

}
