import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = "";

    while (sc.hasNextLine()) {
      input = sc.nextLine();

      Scanner inputLine = new Scanner(input);
      ArrayList<Integer> inputNumbers = new ArrayList<>();

      while (inputLine.hasNextInt()) {
        inputNumbers.add(inputLine.nextInt());
      }

      ArrayList<Integer> oddIndexNumbers = new ArrayList<>();
      for (int i = 0; i < inputNumbers.size(); i++) {
        if (i % 2 != 0) {
          oddIndexNumbers.add(inputNumbers.get(i));
        }
      }

      Collections.reverse(oddIndexNumbers);

        for (int number : oddIndexNumbers) {
          System.out.print(number + " ");
      }
    }
  }
}
