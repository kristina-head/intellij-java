import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number = 1;
    int n = sc.nextInt();
    String direction = "east";
    int startX = 0, startY = 0;
    int endX = n, endY = n;
    int[][] spiral = new int[n][n];

    while (number <= n * n) {
      switch (direction) {
        case "east":
          for (int i = startX; i < endX; i++) {
            spiral[startY][i] = number;
            number++;
          }
          startY++;
        case "south":
          for (int i = startY; i < endY; i++) {
            spiral[i][endX - 1] = number;
            number++;
          }
          endX--;
        case "west":
          for (int i = endX - 1; i >= startX; i--) {
            spiral[endY - 1][i] = number;
            number++;
          }
          endY--;
        case "north":
          for (int i = endY - 1; i >= startY; i--) {
            spiral[i][startX] = number;
            number++;
          }
          startX++;
          direction = "east";
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(spiral[i][j] + " ");
      }
      System.out.println();
    }
  }
}
