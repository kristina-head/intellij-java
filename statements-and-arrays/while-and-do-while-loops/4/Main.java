import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long m = sc.nextLong();
    long n = 1;
    long factorial = 1;

    while (factorial <= m) {
      factorial *= n;
      if (factorial > m || m == 1) {
        break;
      }
      n++;
    }

    System.out.println(n);
  }
}
