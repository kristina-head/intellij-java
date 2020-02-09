import java.util.Scanner;
import java.util.ArrayDeque;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();

    ArrayDeque<Integer> numbers = new ArrayDeque<>(length);

    for (int i = 0; i < length; i++) {
      int tempNumber = sc.nextInt();
      if (tempNumber % 2 == 0) {
        numbers.addFirst(tempNumber);
      } else {
        numbers.addLast(tempNumber);
      }
    }

    for (int number : numbers) {
      System.out.println(number);
    }
  }
}
