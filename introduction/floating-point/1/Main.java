import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float x = sc.nextFloat();
    BigDecimal bigDecimalX = new BigDecimal(String.valueOf(x)); // 17.9
    int intValue = bigDecimalX.intValue(); // 17

    System.out.println(bigDecimalX.subtract(new BigDecimal(intValue))); // print 17.9 - 17
  }
}
