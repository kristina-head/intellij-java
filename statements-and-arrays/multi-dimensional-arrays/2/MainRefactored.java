import java.util.Scanner;

public class MainRefactored {
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

    for (int i = 0; i < cols; i++) {
      for (int j = 0; j < rows; j++) {
        System.out.print(numbers[j][i] + " ");
      }
    }
  }
}
