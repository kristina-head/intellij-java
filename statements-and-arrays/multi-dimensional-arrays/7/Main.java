import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int rows = sc.nextInt();
    int cols = sc.nextInt();
    int[][] seats = new int[rows][cols];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        seats[i][j] = sc.nextInt();
      }
    }

    int tickets = sc.nextInt();
    int count = 0;
    int ticketRow = 0;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        while (j < cols && seats[i][j] == 0) {
          count++;
          j++;
          if (count == tickets) {
            ticketRow = i + 1;
            break;
          }
        }
        if (ticketRow > 0) {
          break;
        } else {
          count = 0;
        }
      }
      if (ticketRow > 0) {
        break;
      }
    }

    System.out.println(ticketRow);
  }
}
