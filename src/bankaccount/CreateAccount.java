package bankaccount;

import java.util.Scanner;

public class CreateAccount {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, account type, account no, and balance:");

    String name = myObj.nextLine();
    String type = myObj.nextLine();

    int account = 0;
    do {
      while (!myObj.hasNextInt()) {
        myObj.next(); // this is important!
      }
      account = myObj.nextInt();
    } while (account <= 0);
    double balance = myObj.nextDouble();

    System.out.println("Name: " + name);
    System.out.println("Account: " + account);
    System.out.println("Type: " + type);
    System.out.println("Balance: " + balance);

    Bank B = new Bank();
    B.setBankAccounts(new BankAccount(account, name, balance, type));
    System.out.println(B.getBankAccounts());


  }

}
