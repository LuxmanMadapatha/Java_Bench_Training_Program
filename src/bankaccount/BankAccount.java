package bankaccount;

import java.util.ArrayList;

public class BankAccount {

  public int accountNumber;
  ArrayList<Transaction> Transactions = new ArrayList<Transaction>();
  private String accountHolderName;
  private double accountBalance;
  private String accountType;

  public BankAccount(int accountNumber, String accountHolderName, double accountBalance,
      String accountType) {

    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.accountBalance = accountBalance;
    this.accountType = accountType;

  }

  @Override
  public String toString() {
    return "BankAccount{" +
        "accountNumber=" + accountNumber +
        ", accountHolderName='" + accountHolderName + '\'' +
        ", accountBalance=" + accountBalance +
        ", accountType='" + accountType + '\'' +
        ", Transactions=" + Transactions +
        '}';
  }

  public ArrayList<Transaction> getTransactions() {
    return Transactions;
  }

  public void setTransactions(ArrayList<Transaction> transactions) {
    Transactions = transactions;
  }

  public double deposit(double funds) {
    this.accountBalance = this.accountBalance + funds;
    return this.accountBalance;

  }

  public double withdraw(double withdraw) {
    this.accountBalance = this.accountBalance - withdraw;
    return this.accountBalance;
  }

  public int getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(int accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAccountHolderName() {
    return accountHolderName;
  }

  public void setAccountHolderName(String accountHolderName) {
    this.accountHolderName = accountHolderName;
  }

  public double getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(double accountBalance) {
    this.accountBalance = accountBalance;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }
}



