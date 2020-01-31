package exercicoRectangle;
import java.util.Scanner;
import java.util.Locale;
public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Rectangle rect = new Rectangle();
		
		System.out.println("Enter rectangle data: ");
		System.out.print("Enter Width: ");
		rect.width = input.nextDouble();
		
		System.out.print("Enter heigth: ");
		rect.height = input.nextDouble();
		
		System.out.printf("Rectangle Area is: %.2f%n", rect.area());
		System.out.printf("Rectangle Perimeter is: %.2f%n", rect.perimeter());
		System.out.printf("Rectangle Diagonal is: %.2f%n", rect.diagonal());

		input.close();
	}

}
