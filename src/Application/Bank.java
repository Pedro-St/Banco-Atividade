package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Count;

public class Bank {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Count count;

		System.out.print("Inicio do Programa");
		System.out.println();
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.println("Is there na initial deposit (y/n)");
		char c = sc.nextLine().charAt(0);

		if (c == 'y') {

			System.out.println("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			count = new Count(number, holder, deposit);
		} else {
			count = new Count(number, holder);
		}

		System.out.println("Account data: ");
		System.out.println(count);
		System.out.println();

		System.out.print("Enter a deposit value: $");
		double deposit = sc.nextDouble();
		count.newDeposit(deposit);
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(count);

		System.out.println();
		System.out.print("Enter a withdraw value: $");
		double withdraw = sc.nextDouble();
		count.withdraw(withdraw);
		System.out.println();
		System.out.println("Updated account data: ");
		System.out.println(count);

		sc.close();

	}

}
