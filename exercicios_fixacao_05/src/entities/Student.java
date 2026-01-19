package entities;

public class Student {
	
	public String name;
	public double n1, n2, n3;
	
	public double FinalGrade() {
		return (n1 + n2 + n3);
	}
	
	public String toString() {
		return "Student: "
			+ name
			+ "\n"
			+ "First Grade: "
			+ String.format("%.2f", n1)
			+ "\n"
			+ "Second Grade: "
			+ String.format("%.2f", n2)
			+ "\n"
			+ "Thirdy Grade: "
			+ String.format("%.2f", n3)
			+ "\n";	
	}

}
