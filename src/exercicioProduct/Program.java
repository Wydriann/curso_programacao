package exercicioProduct;

import java.util.Scanner;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Enter product Name: ");
		String name = input.nextLine();

		System.out.print("Enter product price: ");
		double price = input.nextDouble();

		Product product = new Product(name, price);

		product.setName("Computer"); // Rename protected attribute to "Computer"
		System.out.println("Product name updated: " + product.getName()); // show protected attribute;

		System.out.println();
		System.out.println("Product Data: " + product);

		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = input.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated Data: " + product);

		System.out.print("Enter the number of products to be removed in stock: ");
		quantity = input.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Product Data: " + product);

		input.close();
	}
}
