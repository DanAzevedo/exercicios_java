package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data");
			System.out.print("Common, used or imported(c/u/i)? ");
			char ch = sc.nextLine().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			sc.nextLine();
			
			if(ch == 'i') {
				System.out.println("Customs fee: ");
				Double customsFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customsFee);
				list.add(product);
				sc.nextLine();
			}else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String date = sc.nextLine();
				Product product = new UsedProduct(name, price, date);
				list.add(product);
			}else {
				Product product = new Product(name, price);
				list.add(product);
			}
			
			}
		
		System.out.println("");
		System.out.println("PRICE TAGS:");
		for(Product product : list) {
			System.out.println(product.priceTag());
		}

	}

}
