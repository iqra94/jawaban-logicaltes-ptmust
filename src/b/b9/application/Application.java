package b.b9.application;

import b.b9.data.Product;

public class Application {
  public static void main(String[] args) {

    Product product = new Product("Mac Book Pro", 30_000_000);
//    System.out.println(product.name); //error protected
//    System.out.println(product.price); //error protected


  }
}
