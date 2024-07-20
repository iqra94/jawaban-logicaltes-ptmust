package e.e9;

import e.e5.error.ValidationException;
import e.e9.annotation.Fancy;
import d.d8.data.LoginRequest;
import e.e5.util.ValidationUtil;

public class ValidationApp {

  @Fancy(name = "AnimalApp", tags = {"application", "java"})
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


    LoginRequest loginRequest2 = new LoginRequest(null, null);
    ValidationUtil.validateRuntime(loginRequest2);
    System.out.println("Sukses");

  }
}
