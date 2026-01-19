package application;
import java.util.Locale;
import entities.Rectangle;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rec = new Rectangle();
		
		System.out.println("Enter rectangle width: ");
		rec.width = sc.nextDouble();
		
		System.out.println("Enter rectangle height: ");
		rec.height = sc.nextDouble();
		
		System.out.println();
		System.out.print(rec);
		
		sc.close();		
	}

}
