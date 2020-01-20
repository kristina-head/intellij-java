import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int length = sc.nextInt();
    String[][] matrix = new String[length][length];
    String dot = ". ";
    String star = "* ";

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        if (i == length / 2 || j == length / 2 || i == j || j == length - 1 - i) {
          matrix[i][j] = star;
        } else {
          matrix[i][j] = dot;
        }
        System.out.print(matrix[i][j]);
      }
      System.out.println();
    }
  }
}
