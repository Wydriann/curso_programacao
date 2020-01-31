package conversionMoney;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); 
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("What this dollar price: ");
		double dollarPrice = input.nextDouble();
		System.out.println();
		System.out.print("How many dollars will be bought?: ");
		double amountReais = input.nextDouble();
		double result = CurrencyConverter.dollarToReal(amountReais, dollarPrice);
		System.out.println();
		System.out.printf("Amount to be paid in reais: %.2f%n", result);
		
		input.close();
	}	
}
