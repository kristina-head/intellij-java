import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int cols = sc.nextInt();
    List<Integer[]> grid = new ArrayList<>();

    for (int i = 0; i < rows; i++) {
      Integer[] temp = new Integer[cols];
      for (int j = 0; j < cols; j++) {
        temp[j] = sc.nextInt();
      }
      grid.add(temp);
    }

    Collections.rotate(grid, sc.nextInt());

    for (Integer[] row : grid) {
      for (Integer number : row) {
        System.out.print(number + " ");
      }
      System.out.println();
    }
  }
}
