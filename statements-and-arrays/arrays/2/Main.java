import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int length = sc.nextInt();
    int[] numbers = new int[length];

    for (int i = 0; i < length; i++) {
      numbers[i] = sc.nextInt();
    }

    if (length == 1) {
      System.out.println(numbers[0]);
    } else {
      long maxPairwiseProduct = 0;
      for (int i = 0; i < length; i++) {
        for (int j = i + 1; j < length; j++) {
          if (numbers[i] * numbers[j] > maxPairwiseProduct) {
            maxPairwiseProduct = numbers[i] * numbers[j];
          }
        }
      }
      System.out.println(maxPairwiseProduct);
    }
  }
}
