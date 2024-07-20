package f.f1.application;

import f.f1.data.CreateUserRequest;
import f.f1.util.ValidationUtil;

public class ReflectionApp {
  public static void main(String[] args) {

    CreateUserRequest request = new CreateUserRequest();
    request.setUsername("eko");
    request.setPassword("eko");
    request.setName("eko");

    ValidationUtil.validationReflection(request);

  }
}
