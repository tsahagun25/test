package ver2;

public class Account {
	private double balance;
	//new comment
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account(double balance) {
		this("Unknown", balance);
	}
	
	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}

	
	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0) {
			balance -= amount;
		}
	}
	
	public void mergeAccount(Account a) {
		if(this.getName().equals(a.getName())) {
			this.balance += a.getBalance();
		}
	}

	
	public void setBalance(double newBal) {
		if(newBal >0.0) {
			balance = newBal;
		}
	}
	
	@Override
	public String toString() {
		String msg = "name=" + name + "balance=$" + balance;
		return msg;
	}
	
	public static void main(String[] args) {
		Account a1 = new Account(1000.0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.deposit(500.0);
		System.out.println("Balance=$" + a1.getBalance());
		a1.withdraw(200.0);
		System.out.println("Balance=$" + a1.getBalance());
		System.out.println(a1.toString());
		System.out.println(a1);
	}
}
