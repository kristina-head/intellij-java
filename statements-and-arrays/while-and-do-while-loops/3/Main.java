import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int square = 0;
    int count = 1;

    while (square <= n) {
      square = count * count;
      if (square > n) {
        break;
      }
      System.out.println(square);
      count++;
    }
  }
}
