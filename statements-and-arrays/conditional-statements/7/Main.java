import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int cols = sc.nextInt();
    int rows = sc.nextInt();
    int noOfSegments = sc.nextInt();

    if ((noOfSegments <= cols * rows) && (noOfSegments % cols == 0 || noOfSegments % rows == 0)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
