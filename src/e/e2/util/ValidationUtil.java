package e.e2.util;

import d.d8.data.LoginRequest;
import e.e2.error.ValidationException;

public class ValidationUtil {

  public static void validate(LoginRequest loginRequest) throws ValidationException {
    if (loginRequest.username() == null) {
      throw new ValidationException("Username is null");
    } else if (loginRequest.username().isBlank()) {
      throw new ValidationException("Username is blank");
    } else if (loginRequest.password() == null) {
      throw new ValidationException("Password is null");
    } else if (loginRequest.password().isBlank()) {
      throw new ValidationException("Password is blank");
    }
  }

}
