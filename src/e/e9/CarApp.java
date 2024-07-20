package e.e9;

import c.c7.data.Avanza;
import e.e9.annotation.Fancy;
import c.c7.data.Car;

@Fancy(name = "CarApp", tags = {"application", "java"})
public class CarApp {
  public static void main(String[] args) {

    Car car = new Avanza();
    System.out.println(car.getTier());
    car.drive();

  }
}
