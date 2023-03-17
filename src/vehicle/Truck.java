package vehicle;

public class Truck extends Vehicle {

  int bedLength;
  double payLoadCapacity;

  public Truck(String make, String model, int year, String color, double price, int bedLength,
      double payLoadCapacity) {
    super(make, model, year, color, price);
    this.bedLength = bedLength;
    this.payLoadCapacity = payLoadCapacity;
  }

  public int getBedLength() {
    return bedLength;
  }

  public void setBedLength(int bedLength) {
    this.bedLength = bedLength;
  }

  public double getPayLoadCapacity() {
    return payLoadCapacity;
  }

  public void setPayLoadCapacity(double payLoadCapacity) {
    this.payLoadCapacity = payLoadCapacity;
  }
}


