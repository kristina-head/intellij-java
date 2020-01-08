import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int queen1x = sc.nextInt();
    int queen1y = sc.nextInt();
    int queen2x = sc.nextInt();
    int queen2y = sc.nextInt();

    if (queen1x == queen2x || queen1y == queen2y || Math.abs(queen1x - queen2x) == Math.abs(queen1y - queen2y)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
