package e.e9;

import c.c3.data.Animal;
import e.e9.annotation.Fancy;
import c.c3.data.Cat;

@Fancy(name = "AnimalApp")
public class AnimalApp {
  public static void main(String[] args) {


    Animal animal = new Cat();
    animal.name = "Puss";
    animal.run();

  }
}
