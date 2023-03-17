package bankaccount;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {

    Bank B = new Bank();

    B.setBankAccounts(new BankAccount(001, "Luxman",10000.0, "Savings"));
    B.setBankAccounts(new BankAccount(002, "Kaushal",150.0, "Savings"));

    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter deposit amount and accountNumber");
    double funds = myObj.nextDouble();
    int account = myObj.nextInt();
    System.out.println(B.getBankAccounts().get(account));
    B.getBankAccounts().get(account).deposit(funds);
    System.out.println(B.getBankAccounts().get(account));
    System.out.println("Enter withdraw amount and accountNumber");
    double withdraw = myObj.nextDouble();
    account = myObj.nextInt();
    B.getBankAccounts().get(account).withdraw(withdraw);
    System.out.println(B.getBankAccounts().get(account));




  }
     }



