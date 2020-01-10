import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    String operator = sc.next();
    long b = sc.nextLong();

    switch (operator) {
      case "+":
        System.out.println(a + b);
        break;
      case "-":
        System.out.println(a - b);
        break;
      case "/":
        if (b == 0) {
          System.out.println("Division by 0!");
        } else {
          System.out.println(a / b);
        }
        break;
      case "*":
        System.out.println(a * b);
        break;
      default:
        System.out.println("Unknown operator");
    }
  }
}
