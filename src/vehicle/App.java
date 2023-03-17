package vehicle;

public class App {

  public static void main(String[] args) {
    Inventory inventory = new Inventory();
    inventory.setVehicle(new Vehicle("Ford", "E10", 1940, "Red", 500.00));
    inventory.setVehicle(new Vehicle("Ford", "E20", 1950, "Blue", 10000.00));
    inventory.setVehicle(new Vehicle("Ford", "E30", 1960, "Green", 20000.00));
    inventory.setVehicle(new Vehicle("Ford", "E40", 1970, "Maroon", 30000.00));

    System.out.println("Average vehicle price: $" + inventory.getAveragePrice()+"\n");
    System.out.println("Filered vehicles:\n" + inventory.searchByMakeAndModel("Ford", "E20").toString());

  }

}
