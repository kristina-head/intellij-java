import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int minSleep = sc.nextInt(); // A
    int maxSleep = sc.nextInt(); // B
    int actualSleep = sc.nextInt(); // H

    if (actualSleep >= minSleep && actualSleep <= maxSleep) {
      System.out.println("Normal");
    } else if (actualSleep < minSleep) {
      System.out.println("Deficiency");
    } else if (actualSleep > maxSleep) {
      System.out.println("Excess");
    }
  }
}
