import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    StringBuilder input = new StringBuilder(sc.nextLine());
    while (!sc.hasNext("end")) {
      input.append(",").append(sc.nextLine());
    }

    String[] rows = input.toString().split(",");
    int[][] matrix = new int[rows.length][];

    for (int i = 0; i < rows.length; i++) {
      String[] col = rows[i].split(" ");
      matrix[i] = new int[col.length];
      for (int j = 0; j < col.length; j++) {
        matrix[i][j] = Integer.parseInt(col[j]);
      }
    }

    int rowsLength = matrix.length;
    int[][] summedMatrix = new int[rowsLength][];

    for (int i = 0; i < rowsLength; i++) {
      String[] col = Arrays.toString(matrix[i]).split(" ");
      int colLength = col.length;
      summedMatrix[i] = new int[colLength];
      for (int j = 0; j < colLength; j++) {
        int iPlus, iMinus, jPlus, jMinus;

        if (i == 0) {
          if (rowsLength == 1) {
            iPlus = 0;
          } else {
            iPlus = i + 1;
          }
          iMinus = rowsLength - 1;
        } else if (i == rowsLength - 1) {
          iPlus = 0;
          iMinus = i - 1;
        } else {
          iPlus = i + 1;
          iMinus = i - 1;
        }

        if (j == 0) {
          if (colLength == 1) {
            jPlus = 0;
          } else {
            jPlus = j + 1;
          }
          jMinus = colLength - 1;
        } else if (j == colLength - 1) {
          jPlus = 0;
          jMinus = j - 1;
        } else {
          jPlus = j + 1;
          jMinus = j - 1;
        }

        summedMatrix[i][j] = matrix[iMinus][j] + matrix[iPlus][j] + matrix[i][jMinus] + matrix[i][jPlus];
      }
    }

    for (int[] sums : summedMatrix) {
      for (int sum : sums) {
        System.out.print(sum + " ");
      }
      System.out.println();
    }
  }
}
