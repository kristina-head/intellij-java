import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int[][] numbers = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }

    int[][] numbersTransposed = new int[cols][rows];

    for (int i = 0; i < cols; i++) {
      for (int j = 0; j < rows; j++) {
        numbersTransposed[i][j] = numbers[j][i];
      }
    }

    for (int i = 0; i < cols; i++) {
      for (int j = 0; j < rows; j++) {
        System.out.print(numbersTransposed[i][j] + " ");
      }
    }
  }
}
