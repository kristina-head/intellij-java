import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String input = sc.nextLine();
    int forward = 0;
    int backward = input.length() - 1;
    String palindrome = "yes";

    while (backward > forward) {
      char forwardLetter = input.charAt(forward++);
      char backwardLetter = input.charAt(backward--);
      if (forwardLetter != backwardLetter) {
        palindrome = "no";
        break;
        }
      }

    System.out.println(palindrome);
  }
}
