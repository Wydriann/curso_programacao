package exerciceStudent;
import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Student stu = new Student();
		
		System.out.print("Enther the student name: ");
		stu.name = input.nextLine();
		System.out.println();
		System.out.print("Enter the first grade: ");
		stu.grade1 = input.nextDouble();
		System.out.println();
		System.out.println();
		System.out.print("Enter the second grade: ");
		stu.grade2 = input.nextDouble();
		System.out.println();
		System.out.print("Enter the tird grade: ");
		stu.grade3 = input.nextDouble();
		
		System.out.printf("Final grade: %.2f%n", stu.finalGrade());
		
		if (stu.finalGrade() < 60.00) {
			System.out.println("FALED");
			System.out.printf("MISSING: %.2f%n", stu.validateGrade());
		}
		else {
			System.out.println("Your PASS!");
		}
		
		
		
		
		input.close();
	}

}
