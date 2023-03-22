package vehicle;

public class Car extends Vehicle {

  short numDoors;
  short numPassengers;
  boolean isConvertible;

  public Car(String make, String model, int year, String color, double price, short numDoors,
      short numPassengers, boolean isConvertible) {
    super(make, model, year, color, price);
    this.numDoors = numDoors;
    this.numPassengers = numPassengers;
    this.isConvertible = isConvertible;
  }

  public int getNumDoors() {
    return numDoors;
  }

  public void setNumDoors(short numDoors) {
    this.numDoors = numDoors;
  }

  public int getNumPassengers() {
    return numPassengers;
  }

  public void setNumPassengers(short numPassengers) {
    this.numPassengers = numPassengers;
  }

  public boolean isConvertible() {
    return isConvertible;
  }

  public void setConvertible(boolean convertible) {
    isConvertible = convertible;
  }
}

