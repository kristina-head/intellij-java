import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int nReverse = 0;
    while (n != 0) {
      nReverse = nReverse * 10 + n % 10;
      n /= 10;
    }
    System.out.println(nReverse);
  }
}
