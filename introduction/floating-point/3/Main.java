import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();

    System.out.println(Math.pow(x, 3) + Math.pow(x, 2) + x + 1);
  }
}
