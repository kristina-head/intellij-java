import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int length = sc.nextInt();
    int[] numbers = new int[length];

    for (int i = 1; i < length; i++) {
      numbers[i] = sc.nextInt();
    }

    numbers[0] = sc.nextInt();

    for (int num : numbers) {
      System.out.print(num + " ");
    }
  }
}
