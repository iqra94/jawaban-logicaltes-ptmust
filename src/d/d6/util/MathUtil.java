package d.d6.util;

public class MathUtil {

  public static int sum(int... values) {
    int total = 0;
    for (var value : values) {
      total += value;
    }
    return total;
  }

}
