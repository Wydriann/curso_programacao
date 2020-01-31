package exercicioEmployee;
import java.util.Scanner;
import java.util.Locale;
public class MainApp {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		Employee emp = new Employee();
		
			
			System.out.println("Enter the employee date: ");
			System.out.print("Enter the name: ");
			emp.name = input.nextLine();
			
			System.out.print("Enter salary: ");
			emp.grossSalary = input.nextDouble();
			
			System.out.print("Enter tax: ");
			emp.tax = input.nextDouble();
			
			System.out.println("Employee: " + emp);
			
			System.out.println();
			System.out.println("Enter percentage: ");
			double percentage = input.nextDouble();
			emp.updateData(percentage);
			System.out.println();
			System.out.println("Employed data updated: " + emp);
			
		input.close();
	}

}
