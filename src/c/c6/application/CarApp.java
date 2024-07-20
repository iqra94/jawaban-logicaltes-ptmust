package c.c6.application;

import c.c6.data.Avanza;
import c.c6.data.Car;

public class CarApp {
  public static void main(String[] args) {

    Car car = new Avanza();
    System.out.println(car.getTier());
    car.drive();

  }
}
