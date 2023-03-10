package bankaccount;

public class Customer {

  String customerID;
  String customerName;
  String emailAddress;
  String phoneNumber;

  public Customer(String customerID, String customerName, String emailAddress, String phoneNumber) {
    this.customerID = customerID;
    this.customerName = customerName;
    this.emailAddress = emailAddress;
    this.phoneNumber = phoneNumber;
  }

  public String getCustomerID() {
    return customerID;
  }

  public void setCustomerID(String customerID) {
    this.customerID = customerID;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}
