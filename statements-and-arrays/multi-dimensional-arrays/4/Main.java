import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] numbers = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }

    int[][] numbersTransposed = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = n - 1; j >= 0; j--) {
        numbersTransposed[i][j] = numbers[j][i];
        System.out.print(numbersTransposed[i][j] + " ");
      }
    System.out.println();
    }
  }
}
