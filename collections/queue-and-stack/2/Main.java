import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length = sc.nextInt();
    ArrayDeque<Integer> numbers = new ArrayDeque<>(length);

    for (int i = 0; i < length; i++) {
      numbers.add(sc.nextInt());
    }

    for (int i = 0; i < length; i++) {
      System.out.println(numbers.pollLast());
    }
  }
}
