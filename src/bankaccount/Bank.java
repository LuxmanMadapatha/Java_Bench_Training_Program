package bankaccount;

import java.util.ArrayList;

public class Bank {

  ArrayList<BankAccount> BankAccounts = new ArrayList<BankAccount>();
  ArrayList<Customer> Customers = new ArrayList<Customer>();


  public ArrayList<BankAccount> getBankAccounts() {
    return BankAccounts;
  }

  public void setBankAccounts(BankAccount BA) {
    BankAccounts.add(BA);
  }

  public ArrayList<Customer> getCustomers() {
    return Customers;
  }

  public void setCustomers(Customer customer) {
    Customers.add(customer);


  }
}

