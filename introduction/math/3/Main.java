import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double vector1x = sc.nextDouble();
    double vector1y = sc.nextDouble();
    double vector2x = sc.nextDouble();
    double vector2y = sc.nextDouble();

    double angle = Math.atan(vector2y/vector2x) - Math.atan(vector1y/vector1x);

    System.out.println(Math.toDegrees(Math.abs(angle)));
  }
}
