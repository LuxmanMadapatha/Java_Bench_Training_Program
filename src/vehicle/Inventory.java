package vehicle;

import bankaccount.BankAccount;
import java.util.ArrayList;

public class Inventory {
  ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

  public ArrayList<Vehicle> getVehicles() {
    return vehicles;
  }

  public void setVehicles(ArrayList<Vehicle> vehicles) {
    this.vehicles = vehicles;
  }
}
