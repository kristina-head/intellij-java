import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int value = 1;

    while (count < n) {
      int valueCount = 1;
      while (valueCount <= value) {
        System.out.print(value + " ");
        count++;
        if (count >= n) {
          break;
        }
        valueCount++;
      }
      value++;
    }
  }
}
