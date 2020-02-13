import java.util.Scanner;
import java.util.ArrayDeque;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayDeque<Integer> stack = new ArrayDeque<>();

    int commands = sc.nextInt();
    int max = 0;
    for (int i = 0; i < commands; i++) {
      switch (sc.next()) {
        case "push":
          int value = sc.nextInt();
          if (stack.isEmpty()) {
            stack.push(value);
            max = value;
          } else {
            if (value <= max) {
              stack.push(value);
            } else {
              stack.push(2 * value - max);
              max = value;
            }
          }
          break;
        case "pop":
          if (!stack.isEmpty()) {
            int element = stack.pop();
            if (element > max) {
              max = 2 * max - element;
            }
          }
          break;
        case "max":
          System.out.println(max);
          break;
      }
    }
  }
}
