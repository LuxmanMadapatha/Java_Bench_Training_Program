package bankaccount;

public class Transaction {
  String transactionID;
  String transactionDate;
  double transactionAmount;
  String transactionType;

  public Transaction(String transactionID, String transactionDate, double transactionAmount,
      String transactionType) {
    this.transactionID = transactionID;
    this.transactionDate = transactionDate;
    this.transactionAmount = transactionAmount;
    this.transactionType = transactionType;
  }
}
