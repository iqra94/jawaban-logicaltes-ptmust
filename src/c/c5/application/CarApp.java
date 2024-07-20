package c.c5.application;

import c.c5.data.Avanza;
import c.c5.data.Car;

public class CarApp {
  public static void main(String[] args) {

    Car car = new Avanza();
    System.out.println(car.getTier());
    car.drive();

  }
}
