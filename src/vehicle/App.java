package vehicle;

public class App {

  public static void main(String[] args) {
    Inventory inventory = new Inventory();
//    inventory.setVehicle(new Vehicle("Ford", "E10", 1940, "Red", 500.00));
    inventory.setVehicle(new Vehicle("Ford", "E10", 1950, "Blue", 10000.00));
    inventory.setVehicle(new Vehicle("Ford", "E30", 1960, "Green", 20000.00));
    inventory.setVehicle(new Vehicle("Ford", "E40", 1970, "Maroon", 30000.00));

    inventory.setVehicle(new Car("Ford", "E10", 1940, "Red", 500.00, (short) 2, (short) 2, false));

    System.out.println("Average vehicle price: $" + inventory.getAveragePrice() + "\n");
    System.out.println(
        "Filered vehicles:\n" + inventory.searchByMakeAndModel("Ford", "E10").toString());

  }

}
