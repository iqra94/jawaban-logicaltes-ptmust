package d.d6.data;

public class Application {

  public static final int PROCESSORS;

  static {
    System.out.println("Mengakses class Application");
    PROCESSORS = Runtime.getRuntime().availableProcessors();
  }

}
