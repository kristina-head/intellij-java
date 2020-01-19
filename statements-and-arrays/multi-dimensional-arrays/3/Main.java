import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int length = sc.nextInt();
    int[][] numbers = new int[length][length];

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        numbers[i][j] = Math.abs(j - i);
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }
  }
}
