import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    String[] sequence = input.split(" ");
    ArrayList<String> yourList = new ArrayList<>(Arrays.asList(sequence));

    System.out.println(yourList);
  }
}
