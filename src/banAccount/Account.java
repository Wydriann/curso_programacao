package banAccount;

public class Account {
		
	private int idAccount;
	private String ownerName;
	private double balance;
	
	public Account(int idAccount, String ownerName, double quantity) {
		this.idAccount = idAccount;
		this.ownerName = ownerName;
		addValue(quantity);
	}

	public Account(int idAccount, String ownerName) {
		this.idAccount = idAccount;
		this.ownerName = ownerName;
	}

	public int getIdAccount() {
		return idAccount;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void addValue(double quantity) {
		this.balance += quantity;
	}
	
	public void removeValue(double quantity) {
		this.balance -= quantity + 5;
	}
	
	public String toString() {
		return "Account: " + idAccount + ", "
				+ "Holder: " + ownerName + ", "
				+ "Balance: $ " + String.format("%.2f", balance);
	}

	
	
	
	
}
