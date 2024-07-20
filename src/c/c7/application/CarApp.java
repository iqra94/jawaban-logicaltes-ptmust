package c.c7.application;

import c.c7.data.Avanza;
import c.c7.data.Car;

public class CarApp {
  public static void main(String[] args) {

    Car car = new Avanza();
    System.out.println(car.getTier());
    car.drive();

  }
}
