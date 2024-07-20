package e.e8.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadApp {
  public static void main(String[] args) {

//manual
//    BufferedReader reader = null;
//    try{
//      reader = new BufferedReader(new FileReader("README.md"));
//
//      while (true){
//        String line = reader.readLine();
//        if (line == null){
//          break;
//        }
//        System.out.println(line);
//      }
//    } catch (Throwable throwable) {
//      System.out.println("err membaca resource "+ throwable.getMessage());
//    } finally {
//      if (reader != null){
//        try {
//          reader.close();
//          System.out.println("sukses menutup");
//        } catch (IOException exception){
//          System.out.println("err menutup resource "+ exception.getMessage());
//        }
//      }
//    }

//automatis
    try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {

      while (true) {
        String line = reader.readLine();
        if (line == null) {
          break;
        }
        System.out.println(line);
      }

    } catch (Throwable throwable) {
      System.out.println("Error membaca file " + throwable.getMessage());
    }

  }
}
