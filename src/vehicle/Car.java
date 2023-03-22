package vehicle;

public class Car extends Vehicle {

  private short numDoors;
  private short numPassengers;
  private boolean isConvertible;

  public Car(String make, String model, int year, String color, double price, short numDoors,
      short numPassengers, boolean isConvertible) {
    super(make, model, year, color, price);
    this.numDoors = numDoors;
    this.numPassengers = numPassengers;
    this.isConvertible = isConvertible;
  }

  @Override
  public String toString() {
    return "Car{" +
        "make='" + getMake() + '\'' +
        ", model='" + getModel() + '\'' +
        ", year=" + getYear() +
        ", color='" + getColor() + '\'' +
        ", price=" + getPrice() +
        "numDoors=" + numDoors +
        ", numPassengers=" + numPassengers +
        ", isConvertible=" + isConvertible +
        '}';
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

