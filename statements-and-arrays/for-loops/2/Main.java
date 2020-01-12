import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalNumbers = sc.nextInt();
    int maxNumber = 0;

    for (int i = 1; i <= totalNumbers; i++) {
      int number = sc.nextInt();
      if (number % 4 == 0 && number > maxNumber) {
        maxNumber = number;
      }
    }

    System.out.println(maxNumber);
  }
}
