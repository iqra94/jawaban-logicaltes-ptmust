package e.e6.application;

import e.e6.error.DatabaseError;

public class DatabaseApp {
  public static void main(String[] args) {
    connectDatabase("eko", null);
    System.out.println("Sukses");
  }

  public static void connectDatabase(String username, String password) {
    if (username == null || password == null) {
      throw new DatabaseError("Tidak bisa konek ke database");
    }
  }
}
