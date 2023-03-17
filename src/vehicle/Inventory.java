package vehicle;

import bankaccount.BankAccount;
import java.util.ArrayList;

public class Inventory {

  ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();

  public double getAveragePrice() {
    double total = 0;
    for (Vehicle vehicle : Vehicles) {
      total += vehicle.price;
    }
    return total/ Vehicles.size();
  }

  public ArrayList<Vehicle> getVehicles() {
    return Vehicles;
  }

  public void setVehicle(Vehicle vehicle) {
    Vehicles.add(vehicle);
  }
}