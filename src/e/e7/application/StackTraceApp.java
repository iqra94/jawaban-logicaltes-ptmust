package e.e7.application;

public class StackTraceApp {
  public static void main(String[] args) {

// ke1
//    try {
//      String[] names = {
//              "Eko", "Kurniawan", "Khannedy"
//      };
//
//      System.out.println(names[100]);
//    } catch (Throwable throwable) {
//      StackTraceElement[] stackTraceElements = throwable.getStackTrace();
//      throwable.printStackTrace();
//    }

// ke2
    try {
      sampleError();
    } catch (RuntimeException exception) {
      exception.printStackTrace();
    }

  }

// ke2
  public static void sampleError() {
    try {
      String[] names = {
          "Eko", "Kurniawan", "Khannedy"
      };

      System.out.println(names[100]);
    } catch (Throwable throwable) {
      throw new RuntimeException(throwable);
    }
  }
}
