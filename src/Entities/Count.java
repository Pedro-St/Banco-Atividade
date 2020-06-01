package Entities;

public class Count {

	private int number;
	private String holder;
	private double deposit;


	public Count(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Count(int number, String holder, double deposit) {
		this.number = number;
		this.holder = holder;
		newDeposit(deposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getDeposit() {
		return deposit;
	}

	
	
	public void newDeposit(double deposit) {
		this.deposit += deposit; 
	}
	
	
	public void withdraw(double deposit) {
		this.deposit -= deposit +5.0;
	}
	
	
	
	
	public String toString() {
		return "Account "
				+ number + ", " 
				+ holder 
				+ ", " 
				+ "Balance: $ " 
				+ String.format("%.2f", deposit);
	}

}


