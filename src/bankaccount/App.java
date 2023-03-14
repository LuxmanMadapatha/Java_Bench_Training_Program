package bankaccount;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) {

    Bank B = new Bank();
    B.setBankAccounts(new BankAccount(001, "Luxman",1000000.0, "Savings"));
    B.setBankAccounts(new BankAccount(002, "Kaushal",1000000.0, "Savings"));
    System.out.println(B.getBankAccounts());


     }

}
