import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int length = sc.nextInt();
    int[] numbers = new int[length];

    for (int i = 0; i < length; i++) {
      numbers[i] = sc.nextInt();
    }

    int n = sc.nextInt();
    int m = sc.nextInt();
    boolean check = false;

    for (int i = 0; i < length; i++) {
      if (numbers[i] == n) {
        if (numbers[i - 1] == m) {
          check = true;
        }
      } else if (numbers[i] == m) {
        if (numbers[i - 1] == n) {
          check = true;
        }
      }
    }

    System.out.println(check);
  }
}
