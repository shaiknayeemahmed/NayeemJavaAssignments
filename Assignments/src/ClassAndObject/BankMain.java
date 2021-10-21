package ClassAndObject;

public class BankMain {

	public static void main(String[] args) {
		Bank b = new Bank(10000);
		b.deposit(2000);
		System.out.println(b.getBalance());
		
		b.withdraw(1000);
		System.out.println(b.getBalance());
	}

}
