package vehicle;

import bankaccount.BankAccount;
import java.util.ArrayList;

public class Inventory {

  ArrayList<Vehicle> Vehicles = new ArrayList<Vehicle>();
  ArrayList<Vehicle> VehiclesFiltered = new ArrayList<Vehicle>();

  public double getAveragePrice() {
    double total = 0;
    for (Vehicle vehicle : Vehicles) {
      total += vehicle.price;
    }
    return total / Vehicles.size();
  }

  public ArrayList<Vehicle> searchByMakeAndModel(String make, String model) {
    for (Vehicle vehicle : Vehicles) {

      if (vehicle.make.equals(make) && vehicle.model.equals(model)) {
        VehiclesFiltered.add(vehicle);
      }
    }

    return VehiclesFiltered;
  }


  public ArrayList<Vehicle> getVehicles() {
    return Vehicles;
  }

  public void setVehicle(Vehicle vehicle) {
    Vehicles.add(vehicle);
  }
}