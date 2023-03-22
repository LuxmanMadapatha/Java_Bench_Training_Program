package bankaccount;

import java.util.Scanner;
public class App {

  public static void main(String args[]) {

    Bank B = new Bank();

    B.setBankAccounts(new BankAccount(001, "Luxman", 10000.0, "Savings"));
    B.setBankAccounts(new BankAccount(002, "Kaushal", 150.0, "Savings"));

    Scanner myObj = new Scanner(System.in);

    int account = 0;
    BankAccount checkAccount = null;

    do {
      System.out.println("Please enter the accountNumber");

      while (!myObj.hasNextInt()) {
        System.out.println("That's not a valid (numerical) bank number!");
        myObj.next();
      }
      account = myObj.nextInt();
      int finalAccount = account;
      checkAccount = B.getBankAccounts().stream().filter(l -> l.accountNumber == finalAccount)
          .findFirst().orElse(null);

      if (checkAccount == null) {
        System.out.println("Entered bank account not available!\n");
        account = -1;
      }

    } while (account <= 0);

    System.out.println("Your current account balance details:\n" + B.getBankAccounts().get(account - 1) + "\n");

    double withdraw = 0.00;
    do {
      System.out.println("Please enter the withdrawal amount");
      while (!myObj.hasNextDouble()) {
        System.out.println("That's not a valid amount!");
        myObj.next();
      }
      withdraw = myObj.nextDouble();

      if (withdraw <= 0.01){
        System.out.println("withdrawal cannot be a negative number or less than 0.01!\n");
      }

    } while (withdraw <= 0.01);

    B.getBankAccounts().get(account - 1).withdraw(withdraw);
    System.out.println("Your new account balance details:\n" + B.getBankAccounts().get(account - 1));
  }
}