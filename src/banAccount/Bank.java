package banAccount;

import java.util.Locale;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter the account number: ");
		int idAccount = input.nextInt();
		input.nextLine();

		System.out.print("Enter the account owner: ");
		String ownerName = input.nextLine();

		System.out.print("Is there na initial deposit (y/n)?: ");
		char op = input.next().charAt(0);

		if (op == 'y') {
			System.out.println("Enter the initial value: ");
			double quantity = input.nextDouble();
			account = new Account(idAccount, ownerName, quantity);
			
		} else {
			account = new Account(idAccount, ownerName);

		}

		System.out.println("\nUpdated ccount data:");
		System.out.println(account);

		System.out.print("Enter the a deposit value: ");
		double addQuantity = input.nextDouble();
		account.addValue(addQuantity);

		System.out.println("\nUpdated account data: \n");
		System.out.println(account);

		System.out.println("Enter a withdraw value: ");
		double removeQuantity = input.nextDouble();
		account.removeValue(removeQuantity);

		System.out.println("\nUpdated account data:");
		System.out.println(account);

		input.close();
	}

}
