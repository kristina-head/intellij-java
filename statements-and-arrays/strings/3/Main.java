import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine().toUpperCase();
    char[] sequence = input.toCharArray();
    double count = 0;

    for (char letter : sequence) {
      if (letter == 'G' || letter == 'C') {
        count++;
      }
    }

    System.out.println((count / sequence.length) * 100);
  }
}
