package b.b5;

public class PolymorphismApp {
  public static void main(String[] args) {


    Employee employee = new Employee("EKo");
    employee.sayHello("Budi");

    employee = new Manager("Eko");
    employee.sayHello("Budi");

    employee = new VicePresident("Eko");
    employee.sayHello("Budi");

    sayHello(new Employee("Eko"));
    sayHello(new Manager("Joko"));
    sayHello(new VicePresident("Budi"));
  }

  static void sayHello(Employee employee) {
    System.out.println("Hello " + employee.name);
  }
}
