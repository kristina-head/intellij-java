import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayDeque<Integer> queue1 = new ArrayDeque<>();
    ArrayDeque<Integer> queue2 = new ArrayDeque<>();
    int load1 = 0;
    int load2 = 0;
    
    int tasks = sc.nextInt();
    for (int i = 0; i < tasks; i++) {
      if (load1 <= load2) {
        queue1.add(sc.nextInt());
        load1 += sc.nextInt();
      } else {
        queue2.add(sc.nextInt());
        load2 += sc.nextInt();
      }
    }

    for (int taskId : queue1) {
      System.out.print(taskId + " ");
    }
    System.out.println();
    for (int taskId : queue2) {
      System.out.println(taskId + " ");
    }
  }
}
