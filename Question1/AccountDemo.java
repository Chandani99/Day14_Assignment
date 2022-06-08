package Question1;

import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) throws InsufficientFundsException {
		Scanner sc=new Scanner(System.in);
		
		Account acc=new Account("56984768947");
		
		acc.deposit(50000);
		
		try {
			int amount=60000;
			double rem=acc.withdraw(amount);
			System.out.println("Remaining Amoun is: " +rem);
		}
		catch(InsufficientFundsException ife) {
			System.out.println(ife.getMessage());
		}

	}

}
