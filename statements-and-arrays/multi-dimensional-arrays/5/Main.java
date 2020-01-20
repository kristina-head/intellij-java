import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] numbers = new int[n][m];

    for (int a = 0; a < n; a++) {
      for (int b = 0; b < m; b++) {
        numbers[a][b] = sc.nextInt();
      }
    }

    int i = sc.nextInt();
    int j = sc.nextInt();

    int temp;
    for (int a = 0; a < n; a++) {
      for (int b = i; b == i; b++) {
        temp = numbers[a][b];
        numbers[a][b] = numbers[a][j];
        numbers[a][j] = temp;
      }
    }

    for (int a = 0; a < n; a++) {
      for (int b = 0; b < m; b++) {
        System.out.print(numbers[a][b] + " ");
      }
      System.out.println();
    }
  }
}
