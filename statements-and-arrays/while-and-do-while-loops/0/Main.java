import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int value = sc.nextInt();
    int count = 0;

    while (value > 0) {
      value = sc.nextInt();
      count++;
    }

    System.out.println(count);
  }
}
