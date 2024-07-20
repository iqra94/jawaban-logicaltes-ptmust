package d.d6.application;

import d.d6.data.Country;
import d.d6.util.MathUtil;

import static d.d6.data.Application.PROCESSORS;
import static d.d6.data.Constant.*;

public class StaticApp {
  public static void main(String[] args) {

    System.out.println(APPLICATION);
    System.out.println(VERSION);

    System.out.println(
        MathUtil.sum(1,1,1,1,1)
    );

    Country.City city = new Country.City();
    city.setName("Subang");

    System.out.println(city.getName());

    System.out.println(PROCESSORS);
  }
}
