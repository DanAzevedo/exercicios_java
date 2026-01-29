package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program2 {

	public static void main(String[] args) {
		// "alturas"
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		Integer[] idades = new Integer[n];
		Double[] alturas = new Double[n];		
		
		for(int i=0; i<n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			
			System.out.print("Alturas: ");
			alturas[i] = sc.nextDouble();
		}
		
		Double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += alturas[i];
		}
		Double media = soma / n;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		
		Integer cont = 0;
		for(int i=0; i<n; i++) {
			if(idades[i]<16) {
				cont += 1;
			}
		}
		
		// n = total de pessoas; cont = total de pessoas -16;
		// aplica-se regra de 3
		Double percentagem = cont * 100.0 / n;
		
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentagem);
		
		for(int i=0; i<n; i++) {
			if(idades[i]<16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}

}
