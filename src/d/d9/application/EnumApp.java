package d.d9.application;

import d.d9.data.Customer;
import d.d9.data.Level;

public class EnumApp {
  public static void main(String[] args) {

    Customer customer = new Customer();
    customer.setName("Eko");
    customer.setLevel(Level.PREMIUM);

    System.out.println(customer.getName());
    System.out.println(customer.getLevel());

  }
}
