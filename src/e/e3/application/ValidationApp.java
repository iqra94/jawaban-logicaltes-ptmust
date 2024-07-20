package e.e3.application;

import d.d8.data.LoginRequest;
import e.e3.error.ValidationException;
import e.e3.util.ValidationUtil;

public class ValidationApp {

  public static void main(String[] args) {

    LoginRequest loginRequest = new LoginRequest("eko", "rahasia");

//    try {
//      ValidationUtil.validate(loginRequest);
//      System.out.println("Data valid");
//    } catch (ValidationException exception) {
//      System.out.println("Data tidak valid : " + exception.getMessage());
//    } catch (NullPointerException exception) {
//      System.out.println("Data null : " + exception.getMessage());
//    }

    try {
      ValidationUtil.validate(loginRequest);
      System.out.println("Data valid");
    } catch (ValidationException | NullPointerException exception) {
      System.out.println("Data tidak valid : " + exception.getMessage());
    }

  }
}
