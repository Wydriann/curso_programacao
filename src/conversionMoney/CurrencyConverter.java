package conversionMoney;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double dollarToReal (double amountReais, double dollarPrice) {
		return amountReais * dollarPrice * (1.00 + IOF);
	}

}
