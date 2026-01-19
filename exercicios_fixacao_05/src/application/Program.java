package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.print("Student's name: ");
		s.name = sc.next();
		
		System.out.print("Enter the first grade: ");
		s.n1 = sc.nextDouble();
		
		System.out.print("Enter the second grade: ");
		s.n2 = sc.nextDouble();
		
		System.out.print("Enter the thirdy grade: ");
		s.n3 = sc.nextDouble();
		
		System.out.print(s);
		
		if (s.FinalGrade() < 59) {
			System.out.println("FINAL GRADE = " + s.FinalGrade());
			System.out.println("FAILED");
			System.out.println("MISSING: " + (60 - s.FinalGrade()));
		}else {
			System.out.println("FINAL GRADE = " + s.FinalGrade());
			System.out.println("PASS");
		}

		sc.close();
	}

}
