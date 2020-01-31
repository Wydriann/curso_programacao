package exercicioTriangle;

import java.util.Scanner;
import java.util.Locale;

public class aplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		Triangle x, y;

		x = new Triangle();
		y = new Triangle();

		System.out.println("Digite os valores do Triangulo X:");
		System.out.print("Digite o valor de A: ");
		x.a = input.nextDouble();

		System.out.print("Digite o valor de B: ");
		x.b = input.nextDouble();

		System.out.print("Digite o valor de C: ");
		x.c = input.nextDouble();

		System.out.println("Digite os valores do Triangulo Y:");
		System.out.print("Digite o valor de A: ");
		y.a = input.nextDouble();

		System.out.print("Digite o valor de B: ");
		y.b = input.nextDouble();

		System.out.print("Digite o valor de C: ");
		y.c = input.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Area de X: %.2f%n", areaX);
		System.out.printf("Area de Y: %.2f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Maior area: X");
		} else {
			System.out.println("Maior area: Y");

			input.close();
		}
	}

}
