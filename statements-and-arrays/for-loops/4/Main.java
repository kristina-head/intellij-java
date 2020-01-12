import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    float sum = 0;
    float totalNumbers = 0;

    for (; a <= b; a++) {
      if (a % 3 == 0) {
        sum += a;
        totalNumbers++;
      }
    }

    System.out.println(sum / totalNumbers);
  }
}
