package bankaccount;

import java.util.Scanner;

public class CreateAccount {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter name, account type, account no, and balance:");

    // String input
    String name = myObj.nextLine();
    String type = myObj.nextLine();
//    int account = myObj.nextInt();

//    Scanner sc = new Scanner(System.in);
    int account;
    do {
      System.out.println("Please enter a positive number!");
      while (!myObj.hasNextInt()) {
        System.out.println("That's not a number!");
        myObj.next(); // this is important!
      }
      account = myObj.nextInt();
    } while (account <= 0);
    System.out.println("Thank you! Got " + account);
    double balance = myObj.nextDouble();

    // Output input by user
    System.out.println("Name: " + name);
    System.out.println("Account: " + account);
    System.out.println("Type: " + type);
    System.out.println("Balance: " + balance);

    Bank B = new Bank();
    B.setBankAccounts(new BankAccount(account,name,balance,type));
    System.out.println(B.getBankAccounts());


  }

}
