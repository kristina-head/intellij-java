import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int noOfElements = sc.nextInt();
    int maxElement = 0;
    int count = 1;

    while (count <= noOfElements) {
      int number = sc.nextInt();
      if (number % 4 == 0 && number > maxElement) {
        maxElement = number;
      }
      count++;
    }

    System.out.println(maxElement);
  }
}
