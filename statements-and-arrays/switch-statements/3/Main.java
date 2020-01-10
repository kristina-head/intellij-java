import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String shape = sc.next();

    switch (shape) {
      case "triangle":
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double area = (a + b + c) / 2;
        System.out.println(Math.sqrt(area * (area - a) * (area - b) * (area - c)));
        break;
      case "rectangle":
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println(x * y);
        break;
      case "circle":
        double r = sc.nextDouble();
        double pi = 3.14;
        System.out.println(r * r * pi);
        break;
    }
  }
}
