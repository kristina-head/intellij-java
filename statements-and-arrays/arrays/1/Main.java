import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int length = sc.nextInt();
    int[] numbers = new int[length];

    for (int i = 0; i < length; i++) {
      numbers[i] = sc.nextInt();
    }

    int maxNumIndex = 0;

    for (int i = 1; i < length; i++) {
      if (numbers[i] > numbers[maxNumIndex]) {
        maxNumIndex = i;
      }
    }

    System.out.println(maxNumIndex);
  }
}
