import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int totalScores = sc.nextInt();
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    for (int i = 1; i <= totalScores; i++) {
      int score = sc.nextInt();
      switch (score) {
        case 5:
          a++;
          break;
        case 4:
          b++;
          break;
        case 3:
          c++;
          break;
        case 2:
          d++;
          break;
      }
    }

    System.out.print(d + " " + c + " " + b + " " + a);
  }
}
