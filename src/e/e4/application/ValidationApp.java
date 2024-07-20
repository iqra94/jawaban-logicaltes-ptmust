package e.e4.application;

import d.d8.data.LoginRequest;
import e.e4.error.ValidationException;
import e.e4.util.ValidationUtil;

public class ValidationApp {

  public static void main(String[] args) {

    LoginRequest loginRequest = new LoginRequest("eko", "rahasia");

    try {
      ValidationUtil.validate(loginRequest);
      System.out.println("Data valid");
    } catch (ValidationException | NullPointerException exception) {
      System.out.println("Data tidak valid : " + exception.getMessage());
    } finally {
      System.out.println("Selalu di eksekusi");
    }

  }
}
