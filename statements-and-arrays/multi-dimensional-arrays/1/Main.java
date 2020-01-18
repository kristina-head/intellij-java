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

    int maxNum = Integer.MIN_VALUE;
    int maxNumRow = 0;
    int maxNumCol = 0;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (numbers[i][j] > maxNum) {
          maxNum = numbers[i][j];
          maxNumRow = i;
          maxNumCol = j;
        }
      }
    }

    System.out.println(maxNumRow + " " + maxNumCol);
  }
}
