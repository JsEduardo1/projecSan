package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Account account = new Account();
		List<Account> list = new ArrayList<>();
		
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Account number: ");
			Integer number = sc.nextInt();
			System.out.print("Exclusive plan ? ");
			Boolean exclusivePlan = sc.nextBoolean();
			System.out.print("Balance: ");
			Double saldo = sc.nextDouble();
			System.out.print("Birth date: ");
			Date date = sdf.parse(sc.next());
			account = new Account(name, exclusivePlan, saldo, number, date);
		
			System.out.println();
			System.out.println(account);
			
			System.out.println();
			System.out.print("Want to withdraw or deposit (W/ D)? ");
			char ch = sc.next().charAt(0);
			if (ch == 'W') {
				System.out.print("Enter the withdrawal amount: ");
				double withdraw = sc.nextDouble();
				account.feeWithdraw(withdraw);
				System.out.println();
				System.out.println(account);
			}
			else if(ch == 'D') {
				System.out.print("Enter the deposit amount: ");
				double deposit = sc.nextDouble();
				account.depositVolue(deposit);
				System.out.println();
				System.out.println(account);
			}
			
			list.add(new Account(name, exclusivePlan, saldo, number, date));
		
		sc.close();
	}

}
