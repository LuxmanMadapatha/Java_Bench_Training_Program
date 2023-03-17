package bankaccount;

public class BankAccount {

  @Override
  public String toString() {
    return "BankAccount{" +
        "accountNumber=" + accountNumber +
        ", accountHolderName='" + accountHolderName + '\'' +
        ", accountBalance=" + accountBalance +
        ", accountType='" + accountType + '\'' +
        '}';
  }

  private int accountNumber;
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

  public double deposit(double funds) {
    this.accountBalance = this.accountBalance + funds;
    return this.accountBalance;

  }

  public double withdraw(int funds) {
    this.accountBalance = this.accountNumber - funds;
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

  public static void main(String[] args) {

  }
}


