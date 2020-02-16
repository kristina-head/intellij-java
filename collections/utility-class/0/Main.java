import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    Scanner inputLine = new Scanner(input);
    List<Integer> elements = new ArrayList<>();

    while (inputLine.hasNextInt()) {
      elements.add(inputLine.nextInt());
    }

    int swapsTotal = sc.nextInt();
    for (int i = 0; i < swapsTotal; i++) {
      Collections.swap(elements, sc.nextInt(), sc.nextInt());
    }

    for (Integer number : elements) {
      System.out.print(number + " ");
    }
  }
}
