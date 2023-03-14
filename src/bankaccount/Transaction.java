package bankaccount;

public class Transaction {
  String transactionID;
  String transactionDate;
  double transactionAmount;
  String transactionType;

  public String getTransactionID() {
    return transactionID;
  }

  public void setTransactionID(String transactionID) {
    this.transactionID = transactionID;
  }

  public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  public double getTransactionAmount() {
    return transactionAmount;
  }

  public void setTransactionAmount(double transactionAmount) {
    this.transactionAmount = transactionAmount;
  }

  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public Transaction(String transactionID, String transactionDate, double transactionAmount,
      String transactionType) {
    this.transactionID = transactionID;
    this.transactionDate = transactionDate;
    this.transactionAmount = transactionAmount;
    this.transactionType = transactionType;
  }
}
